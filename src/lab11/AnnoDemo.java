package lab11;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class AnnoDemo {
    public static void main(String[] args) {
        Annotation[] annotations = Student.class.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotations));

        CrazyStudent annotation = Student.class.getDeclaredAnnotation(CrazyStudent.class);
        System.out.println(annotation.value() + " " + annotation.rating());


        for (Method method : Student.class.getDeclaredMethods()) {
            for (Annotation anno : method.getDeclaredAnnotations()) {
                System.out.println(anno.annotationType().getSimpleName());

            }

        }


    }
}


