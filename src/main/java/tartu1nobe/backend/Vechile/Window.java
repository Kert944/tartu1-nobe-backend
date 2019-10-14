package tartu1nobe.backend.Vechile;

public class Window {
    private static final int MAXIMUM_OPEN_PERCENTAGE = 100;
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
        if (openedPercentage == 0 && amountInPercentage > 0) {
            setStatus(OpenedClosedStatus.OPENED);
        }
        if (openedPercentage + amountInPercentage > MAXIMUM_OPEN_PERCENTAGE) {
            setOpenedPercentage(MAXIMUM_OPEN_PERCENTAGE);
        }
        else {
            setOpenedPercentage(openedPercentage + amountInPercentage);
        }
    }

    public void close(int amountInPercentage) {
        if (openedPercentage != 0 && openedPercentage - amountInPercentage <= 0) {
            setStatus(OpenedClosedStatus.CLOSED);
        }
        if (openedPercentage - amountInPercentage <= 0) {
            setOpenedPercentage(0);
        }
        else {
            setOpenedPercentage(openedPercentage - amountInPercentage);
        }
    }

    public void close() {
        setStatus(OpenedClosedStatus.CLOSED);
        setOpenedPercentage(0);
    }

    public void open() {
        setStatus(OpenedClosedStatus.OPENED);
        setOpenedPercentage(100);
    }

    public boolean isOpened() {
        return OpenedClosedStatus.OPENED.equals(status);
    }

    public boolean isClosed() {
        return OpenedClosedStatus.CLOSED.equals(status);
    }
}
