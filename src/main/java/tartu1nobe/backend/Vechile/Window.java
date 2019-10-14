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
            status = OpenedClosedStatus.OPENED;
        }
        if (openedPercentage + amountInPercentage > MAXIMUM_OPEN_PERCENTAGE) {
            openedPercentage = MAXIMUM_OPEN_PERCENTAGE;
        }
        else {
            openedPercentage += amountInPercentage;
        }
    }

    public void close(int amountInPercentage) {
        if (openedPercentage != 0 && openedPercentage - amountInPercentage <= 0) {
            status = OpenedClosedStatus.CLOSED;
        }
        if (openedPercentage - amountInPercentage <= 0) {
            openedPercentage = 0;
        }
        else {
            openedPercentage -= amountInPercentage;
        }
    }

    public void close() {
        status = OpenedClosedStatus.CLOSED;
        openedPercentage = 0;
    }

    public void open() {
        status = OpenedClosedStatus.OPENED;
        openedPercentage = 100;
    }

    public boolean isOpened() {
        return OpenedClosedStatus.OPENED.equals(status);
    }

    public boolean isClosed() {
        return OpenedClosedStatus.CLOSED.equals(status);
    }
}
