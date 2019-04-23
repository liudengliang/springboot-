package springboot2.demo.utli;

import java.util.HashMap;
import java.util.Map;

public class ResponseCode {
    private int code;
    private Map data = new HashMap();
    public Map getData() {
        return data;
    }
    private ResponseCode(int code) {
        this.code = code;
    }
    public static ResponseCode SUCCESS(){
        return new ResponseCode(200);
    }
    public static ResponseCode ERREO(){
        return new ResponseCode(500);
    }
    public static ResponseCode OTHERS(int code){
        return new ResponseCode(code);
    }

}
