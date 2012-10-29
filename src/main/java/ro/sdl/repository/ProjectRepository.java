package ro.sdl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.sdl.domain.Project;
import ro.sdl.domain.User;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

    Project load(Integer projectId) throws RepositoryException;

    Collection<Project> getProjects() throws RepositoryException;

    void add(Project project) throws RepositoryException;

    void update(Project project) throws RepositoryException;

    void delete(Integer projectId);

    public List<User> getProjectUsers(Project project);
}
