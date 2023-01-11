package Lambda;

public class CheckableImpl implements Checkable{
    @Override
    public boolean myTester(String value) {
        System.out.println("Checkable calling");
        if("zajavka".equals(value)){
            return true;
        }
        return false;
    }
}
