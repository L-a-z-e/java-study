package exam03.Week4;

public class Box2 <T>{

    private T data;
    private T lastData;

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public T getLastData(){
        return lastData;
    }

    public void setLastData(T lastData){
        this.lastData = lastData;
    }
    
}
