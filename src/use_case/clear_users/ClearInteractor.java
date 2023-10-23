package use_case.clear_users;

import data_access.FileUserDataAccessObject;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface clearUserDataAccessObject;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessObject) {
        this.clearUserDataAccessObject = clearUserDataAccessObject;
    }


    @Override
    public void execute() {
        clearUserDataAccessObject.clearAllUsers();
    }
}
