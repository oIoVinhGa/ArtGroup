package Helper;

public class Model_Message {

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Model_Message(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Model_Message() {
    }

    private boolean success;
    private String message;
}
