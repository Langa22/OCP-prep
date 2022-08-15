package ocpbook1;

import org.omg.CORBA.SetOverrideType;

enum PrinterType {
    DOTMATRIX,INKJET,LASER
}
public class EnumTest{
    PrinterType printerType;
    public EnumTest(PrinterType pType){
        printerType=pType;
    }
    public void feature(){
        switch (printerType){
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical and almost obsolete");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide best quality");
                break;
        }
    }
    public static void main(String[] args) {
        EnumTest enumTest=new EnumTest(PrinterType.DOTMATRIX);
        enumTest.feature();
    }
}
