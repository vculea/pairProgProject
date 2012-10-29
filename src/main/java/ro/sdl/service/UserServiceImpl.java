package ro.sdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sdl.domain.Project;
import ro.sdl.domain.User;
import ro.sdl.repository.ProjectRepository;
import ro.sdl.repository.RepositoryException;
import ro.sdl.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    UserRepository userRepository;


    public Boolean associateUserToProject(Project project, User user) {
        if (!projectRepository.getProjectUsers(project).contains(user)) {
            project.getUsers().add(user);
            user.setProject(project);
            return true;
        } else
            return false;
    }

    public void add(User user) throws RepositoryException {
        userRepository.add(user);
    }
}
