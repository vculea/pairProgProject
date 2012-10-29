package ro.sdl.service;

import org.springframework.stereotype.Service;
import ro.sdl.domain.Project;
import ro.sdl.domain.User;

@Service
public interface UserService {

    public Boolean associateUserToProject(Project project, User user);

}
