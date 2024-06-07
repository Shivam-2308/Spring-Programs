package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Autowired
    private Student student;

//    public School(@Lazy Student student) {   //use @Lazy in any one of the constructor to solve circular dependency
//        this.student = student;
//    }

    public Student getStudent() {
        return student;
    }

    @Autowired
    public void setStudent(@Lazy Student student) {  //resolving the circular depen. by setter
        this.student = student;
    }
}
