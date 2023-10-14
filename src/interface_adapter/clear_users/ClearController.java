package interface_adapter.clear_users;

// TODO Complete me Done?

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary userClearInteractor;
    public ClearController(ClearInputBoundary userClearInteractor) {
        this.userClearInteractor = userClearInteractor;
    }

    public void execute() {
        userClearInteractor.execute();
    }
}
