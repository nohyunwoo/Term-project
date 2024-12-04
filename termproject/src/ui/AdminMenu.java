package ui;

import java.util.Scanner;
import service.AdminService;
import service.ProcessEnrollmentRequest;

public class AdminMenu {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
//        AdminService adminService = new AdminService();

        while (true) {
            System.out.println("=================================");
            System.out.println("관리자 메뉴");
            System.out.println("1. 동아리 조회");
            System.out.println("2. 동아리 추가");
            System.out.println("3. 동아리 삭제");
            System.out.println("4. 스터디 조회");
            System.out.println("5. 스터디 추가");
            System.out.println("6. 스터디 삭제");
            System.out.println("10. 가입 요청 승인/거절");
            System.out.println("11. 메인 메뉴로 돌아가기");
            System.out.println("=================================");

            System.out.print("선택하세요: ");
            int choice = scanner.nextInt();
            
            
            switch (choice) {
                case 1:
                    AdminService.viewClubs(); // 클럽 조회 기능
                    break;
                case 2:
                    AdminService.addClub(); // 클럽 추가 기능
                    break;
                case 3:
                    AdminService.deleteClub(); // 클럽 삭제 기능
                    break;
//                case 4:
//                    AdminService.viewStudyGroups(); // 스터디 조회 기능
//                    break;
//                case 5:
//                    AdminService.addStudyGroup(); // 스터디 추가 기능
//                    break;
//                case 6:
//                    AdminService.deleteStudyGroup(); // 스터디 삭제 기능
//                    break;
                case 10:
                	ProcessEnrollmentRequest.processEnrollmentRequest(); // 가입 요청 승인/거절
                    break;
                case 11:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
