package interface_adapter.clear_users;

// Done! It calls the execute method of the clear interactor

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
