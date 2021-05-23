package exception;

import java.io.IOException;

public class MultipleExceptionCatching {


    private void methodThatThrowsExceptions() throws IOException, IllegalArgumentException, NullPointerException, ClassNotFoundException {

    }

    public void newMultiCatch() {
        try {
            methodThatThrowsExceptions();
        } catch (IOException | IllegalArgumentException | NullPointerException e) {
            e.printStackTrace(); // log and deal with the exception
        } catch (ClassNotFoundException e) {
            // other specific handling
        }
    }

    public void legacyCatch() {
        try {
            methodThatThrowsExceptions();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // other specific handling
        }
    }

}
