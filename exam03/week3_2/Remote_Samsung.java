package exam03.week3_2;

public class Remote_Samsung implements Remote,Call {

        public void turnOn(){
            System.out.println("전원켜기");
        }
        public void turnOff(){
            System.out.println("전원끄기");
        }
        public void receiveCall(){
            System.out.println("전화받기");
        }

    
}
