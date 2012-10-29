package ro.sdl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ro.sdl.domain.Project;
import ro.sdl.service.ProjectService;

/**
 * Hello world!
 */

public class App {

//    @Autowired
//    private static ProjectRepository projectRepository;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("classpath*:applicationContext.xml");//"spring-config.xml");
//        context.scan("ro.sdl");
        try {
            Project p = new Project(1, "BeGlobal");
            ProjectService projectRepository = (ProjectService) context.getBean(ProjectService.class);
            System.out.println(projectRepository.getAllProjects().size());

//            User u = new User(1, "danila", Role.DEV, State.SENIOR, p);
//            new UserServiceImpl().add(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        PdfTableGeneratorService pdfTableGeneratorService = new PdfTableGeneratorService();
//        pdfTableGeneratorService.generatePdfFile();
//        pdfTableGeneratorService.generatePdfFileWithProjectComposition();
//        pdfTableGeneratorService.generatePdfFileWithProjectDistribution();
//        pdfTableGeneratorService.generatePdfFileWithProjectStateDistribution();
//        pdfTableGeneratorService.generatePdfFileWithStructureDistribution();
//        pdfTableGeneratorService.generatePdfFileWithRoleRatio();
    }


}
