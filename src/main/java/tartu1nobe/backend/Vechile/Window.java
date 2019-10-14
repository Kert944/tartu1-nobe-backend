package tartu1nobe.backend.Vechile;

public class Window {
    private String id;
    private OpenedClosedStatus status;
    private int openedPercentage;

    public void setStatus(OpenedClosedStatus status) {
        this.status = status;
    }

    public int getOpenedPercentage() {
        return openedPercentage;
    }

    public void setOpenedPercentage(int openedPercentage) {
        this.openedPercentage = openedPercentage;
    }

    public void open(int amountInPercentage) {
        //TODO: Implement
    }

    public void close(int amountInPercentage) {
        //TODO: Implement
    }

    public void close() {
        //TODO: Implement
    }

    public void open() {
        //TODO: Implement
    }

    public boolean isOpened() {
        //TODO: Implement
        return false;
    }

    public boolean isClosed() {
        //TODO: Implement
        return false;
    }
}
