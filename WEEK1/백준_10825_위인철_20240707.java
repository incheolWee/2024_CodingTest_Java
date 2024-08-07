import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_10825_위인철_20240117 {
    // 1. 학생 클래스를 name, kor, eng, 이름으로 정의
    static class Student {
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        // 2. 생성자를 만들어준다.
        ArrayList<Student> studentList = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            // 학생 객체를 생성하여 목록에 추가해준다.
            studentList.add(new Student(name, kor, eng, math));
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                if (s1.kor == s2.kor) {
                    if (s1.eng == s2.eng) {
                        if (s1.math == s2.math) {
                            return s1.name.compareTo(s2.name);
                        }
                        return s2.math - s1.math;
                    }
                    return s1.eng - s2.eng;
                }
                return s2.kor - s1.kor;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : studentList) {
            sb.append(student.name).append('\n');
        }
        System.out.println(sb);
    }

}
