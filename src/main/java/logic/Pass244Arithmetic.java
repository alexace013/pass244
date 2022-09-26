package logic;

import exception.LogicPass244Exception;

public class Pass244Arithmetic {

    public static void main(String[] args) {
        Pass244Arithmetic pass244Arithmetic = new Pass244Arithmetic();
        try {
            System.out.println(pass244Arithmetic.generatePass244("1114"));
        } catch (LogicPass244Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String generatePass244(String inputValue) throws LogicPass244Exception {
        char[] charNumbers = inputValue.toCharArray();
        return passLogic244(Short.parseShort(String.valueOf(charNumbers[0])),
                Short.parseShort(String.valueOf(charNumbers[1])),
                Short.parseShort(String.valueOf(charNumbers[2])),
                Short.parseShort(String.valueOf(charNumbers[3])));
    }

    private String passLogic244(short val1, short val2, short val3, short val4) throws LogicPass244Exception {
        byte res1Plus2 = (byte) (val1 + val2);
        byte res3Plus4 = (byte) (val3 + val4);
        String resultPrintValue = "";
        if (res1Plus2 < 10 && res3Plus4 < 10) {
            resultPrintValue = resultPrintValue.concat("0".concat(String.valueOf(res1Plus2))
                    .concat(resultPrintValue.concat("0".concat(String.valueOf(res3Plus4)))));
        } else if (res1Plus2 >= 10 && res3Plus4 >= 10) {
            resultPrintValue = resultPrintValue.concat(String.valueOf(res1Plus2)
                    .concat(String.valueOf(res3Plus4)));
        } else if (res1Plus2 < 10 && res3Plus4 >= 10) {
            resultPrintValue = resultPrintValue.concat("0".concat(String.valueOf(res1Plus2))
                    .concat(String.valueOf(res3Plus4)));
        } else if (res1Plus2 >= 10 && res3Plus4 < 10) {
            resultPrintValue = resultPrintValue.concat(String.valueOf(res1Plus2)
                    .concat(resultPrintValue.concat("0".concat(String.valueOf(res3Plus4)))));
        } else {
            resultPrintValue = String.valueOf(-1);
        }
        if (Integer.parseInt(resultPrintValue) < 0) {
            throw new LogicPass244Exception("!!! --- > Incorrect PASS LOGIC 244 implementation < --- !!!");
        } else {
            return "You generated PASS pass244:\n==========\n".concat("\033[0;1m".concat(resultPrintValue).concat("\033[0m\n==========\n"));
        }
    }
}