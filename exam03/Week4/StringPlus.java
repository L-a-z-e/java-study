package exam03.Week4;

public class StringPlus {

        StringBuilder sb = null;

        StringPlus(){
            sb = new StringBuilder(32);


        }

        public void append(String str){
            sb.append(str);
        }

        @Override
        public String toString(){
            return sb.toString();
        }

        public StringPlus appendFormat(String format, Object... args){
           sb.append(String.format(format, args));
           return this;

        }

        public StringPlus appendLine(String str){
            sb.append(str);
            sb.append(System.lineSeparator());
            return this;
        }

    
}
