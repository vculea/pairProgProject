package ro.sdl.service;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;

public interface UserService {

    public Boolean associateUserToProject(Project project, User user);

}
