package br.com.hoiama.main;

import br.com.hoiama.controller.DashboardAdminController;
import br.com.hoiama.entity.Aluno;
import br.com.hoiama.service.DataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackageClasses = {DataService.class, DashboardAdminController.class})
@EntityScan (basePackageClasses = Aluno.class)
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
