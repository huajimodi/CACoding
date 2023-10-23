package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary clear;

    public ClearController(ClearInputBoundary clear) {
        this.clear = clear;
    }



    public void execute(){
        clear.execute();
    }
}
