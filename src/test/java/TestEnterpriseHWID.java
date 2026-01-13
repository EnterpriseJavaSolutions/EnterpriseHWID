import com.github.com.github.EnterpriseJavaSolutions.EnterpriseHWID.EnterpriseHWID;

public class TestEnterpriseHWID {
    public static void main(String[] args) {
        String hwid = EnterpriseHWID.getHWID();
        System.out.println("Enterprise HWID: " + hwid);
    }
}
