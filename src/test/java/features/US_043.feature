@US_043
Feature: Student Quiz Results Management
  As a Student user
  I want to manage my quiz results and not participated quizzes
  So that I can track my quiz performance and access missed quizzes

  Background:
    Given Student kullanici dashboard sayfasinda

  @TC_43_01 @FurkanTest
  Scenario: Dashboard sidebar Quizzes altında My Results ve Not Participated linklerinin görünürlüğü
    When Dashboard sidebar'da Quizzes başlığını görür
    Then Quizzes altında "My Results" linki görünür ve aktif olmalıdır
    And Quizzes altında "Not Participated" linki görünür ve aktif olmalıdır

  @TC_43_02 @FurkanTest
  Scenario: My Results sayfasında istatistiklerin görüntülenmesi ve filtreleme
    When Dashboard sidebar'da Quizzes altındaki "My Results" linkine tıklar
    Then "Quiz Results" sayfasına yönlendirilir
    And Sayfa üzerinde istatistikler görüntülenebilmeli


  @TC_43_03 @FurkanTest
  Scenario: Not Participated sayfasında filtreleme ve işlem yapma
    When Dashboard sidebar'da Quizzes altındaki "Not Participated" linkine tıklar
    Then "Not Participated Quizzes" sayfasına yönlendirilir