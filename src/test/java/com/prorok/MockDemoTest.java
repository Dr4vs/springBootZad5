package com.prorok;


import com.prorok.dao.StudentDAO;
import com.prorok.entity.Student;
import com.prorok.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockDemoTest {

    //checmy zrobic 2 testy
    //1 - test metody z service bez polaczenia z "baza danych" (trzeba uzyć mockowania)

    //2 - test metody z kontrolera - sprawdzenie czy metoda getAllStudents zwroci
    //status poprawnego wykonania metody restowej

    @Autowired
    private WebApplicationContext context;

    @Mock
    private StudentDAO studentDAO;

    @InjectMocks
    private StudentService studentService;

    //do testowania kontolera
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        List<Student> list = Arrays.asList(
                new Student(1, "Asia", "Xyz", "BootCamp"),
                new Student(2, "Tomek", "Daaa", "BootCamp")
        );
        //deklaruje ze gdy nastapi proba pobrania studentow z bazy danych
        //przy uzyciu dao to zamiast tego zwroc powyzsza liste
        when(studentDAO.getAllStudents()).thenReturn(list);

        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }


    //test kontrolera
    @Test
    public void controllerTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Students"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
