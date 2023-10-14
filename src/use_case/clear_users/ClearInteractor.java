package use_case.clear_users;

// Done!

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface signupDataAccessInterface,
                           ClearOutputBoundary OutputBoundary) {
        this.userDataAccessObject = signupDataAccessInterface;
        this.userPresenter = OutputBoundary;
    }

    @Override
    public void execute() {
        try {
            userDataAccessObject.delete();
            userPresenter.prepareSucesssView();

        }
        catch(Exception e) {
            userPresenter.prepareFailView(e.getMessage());
        }
    }
}
