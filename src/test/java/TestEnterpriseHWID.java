import com.github.EnterpriseJavaSolutions.EnterpriseHWID;

public class TestEnterpriseHWID {
    public static void main(String[] args) {
        String hwid = EnterpriseHWID.getHWID();
        System.out.println("Enterprise HWID: " + hwid);
    }
}
