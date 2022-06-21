package hash;

import java.security.MessageDigest;
import java.security.SecureRandom;

public class User {
    private static final int SALT_SIZE = 16;    // SALT는 128비트, 즉 16바이트로 고정시킬 것이기 때문에 크기는 16으로 고정해준다.
    private static DB db = new DB();

    // 새 계정 만들기
    public void set_User(String ID, byte[] Password) throws Exception {
        String SALT = getSALT();
        db.set_User(ID, Hashing(Password, SALT), SALT);
    }

    // 유저 정보와 대조한 뒤 로그인 하기
    public void get_User(String ID, byte[] password) throws Exception {
        String temp_salt = db.get_SALT(ID);                 // 해당 ID의 SALT 값을 찾는다.

        String temp_pass = Hashing(password, temp_salt);    // 얻어온 Salt와 password를 조합해 본다.

        if (db.check(ID, temp_pass)) {                      // db에 저장된 아이디와 비밀번호를 대조한다.
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }
    }

    // 입력받은 비밀번호와 Salt를 합쳐서 여러번의 해싱을 거쳐 최정 다이제스트를 보내는 역할
    private String Hashing(byte[] password, String Salt) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");    // SHA-256 해시함수를 사용

        // key-stretching
        for (int i=0; i<10000; i++) {                       // 임의적으로 10000번 반복
            String temp = Byte_to_String(password) + Salt;  // 패스워드와 Salt를 합쳐 새로운 문자열 생성
            md.update(temp.getBytes());                     // temp의 문자열을 해싱하여 md에 저장해둔다.
            password = md.digest();                         // md 객체의 다이제스트를 얻어 password를 갱신한다.
        }

        return Byte_to_String(password);
    }

    // SALT 값 생성
    private String getSALT() throws Exception {
        SecureRandom rnd = new SecureRandom();
        byte[] temp = new byte[SALT_SIZE];
        rnd.nextBytes(temp);

        return Byte_to_String(temp);
    }

    // 바이트 값을 16진수로 변경해준다.
    private String Byte_to_String(byte[] temp) {
        StringBuilder sb = new StringBuilder();
        for (byte a : temp) {
            sb.append(String.format("%02x", a));
        }
        return sb.toString();
    }

    // 관리자가 DB에 있는 데이터들을 출력하기 위해 만든 메소드
    public void get_DB() {
        System.out.println("\n==============DB출력==============\n");
        System.out.println(db);     // DB 클래스에서 toString()을 오버라이드하여 db를 출력해주면 된다.
    }
}
