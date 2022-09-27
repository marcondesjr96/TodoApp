
package todoapp;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;




public class Main {
    public static void main(String[] args) {
        
//        ProjectController projectController = new ProjectController();
        
//        Project p = new Project();
//        p.setId(1);
//        p.setName("Novo nome do Projeto");
//        p.setDescription("Description");
//        projectController.update(p);
        
//        Project p2 = new Project();
//        p2.setId(2);
//        p2.setName("Novo nome do Projeto2");
//        p2.setDescription("Description");
//        projectController.update(p2);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos " + projects.size());
//              
//        
//        projectController.removeById(2);

            TaskController taskController = new TaskController();
//            
            Task task = new Task();
         
            task.setIdProject(1);
            task.setId(3);
            task.setName("Task Teste 3");
            task.setDescription("no description");
            task.setNotes("No Notes");
            task.setIsCompleted(false);
            task.setDeadline(new Date());
                        
            taskController.update(task);
        
    }
    
}
