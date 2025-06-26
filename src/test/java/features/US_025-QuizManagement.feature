@US_025
Feature: Quiz Management Functionality
  As an Organization/Instructor user
  I want to manage quizzes effectively
  So that I can create, manage and track quiz activities

  Background:
    Given Kullanici dashboard sayfasinda

  @QuizzesSidebar
  Scenario: Dashboard sidebar Quizzes bolumu gorunur olmali
    When Dashboard sidebar'da Quizzes basligi gorunur olmali
    Then Quizzes altinda "New Quiz" linki gorunur ve aktif olmalidir
    And Quizzes altinda "List" linki gorunur ve aktif olmalidir
    And Quizzes altinda "Results" linki gorunur ve aktif olmalidir
    And Quizzes altinda "My Results" linki gorunur ve aktif olmalidir
    And Quizzes altinda "Not Participated" linki gorunur ve aktif olmalidir

  @QuizzesSidebar
  Scenario: Başarıyla Quiz Oluşturma
    When New Quiz linkine tiklar
    Then New Quiz sayfasina yonlendirilir
    When Quiz Title alanina "Test Quiz 2024" girer
    And Pass Mark alanina "75" girer
    And Quiz olustur butonuna tiklar
    Then Yeni quiz basariyla olusturulur

  @QuizzesSidebar
  Scenario: Quize Birden Çok Seçenek Ekleme
    When New Quiz linkine tiklar
    And Quiz Title alanina "Multiple Choice Test" girer
    And Pass Mark alanina "60" girer
    And Quiz olustur butonuna tiklar
    When Add a multiple choice butonu gorunur ve aktif olmali
    And Add a multiple choice butonuna tiklar
    When Question title alanina "Java hangi platformda çalışır?" girer
    And Grade alanina "10" girer
    And Correct answer olarak "JVM" secer
    And Birden fazla soru secenegi ekler
    And Soru kaydet butonuna tiklar
    Then Multiple choice soru basariyla kaydedilir

  @QuizzesSidebar
  Scenario: Add descriptive question to quiz
    When New Quiz linkine tiklar
    And Quiz Title alanina "Descriptive Test" girer
    And Pass Mark alanina "50" girer
    And Quiz olustur butonuna tiklar
    When Add a Descriptive butonu gorunur ve aktif olmali
    And Add a Descriptive butonuna tiklar
    When Question title alanina "Selenium WebDriver'ın avantajları nelerdir?" girer
    And Grade alanina "20" girer
    And Description alanina "Selenium WebDriver'ın test otomasyonundaki rolünü açıklayın" girer
    And Correct answer description alanina "Cross-browser testing, multiple language support, open source" girer
    And Soru kaydet butonuna tiklar
    Then Descriptive soru basariyla olusturulur

  @QuizzesSidebar
  Scenario: View and manage quiz list
    When List linkine tiklar
    Then Quiz listesi sayfasina yonlendirilir
    And Istatistikler goruntulenebilmeli
    When Quiz filtreleme yapar
    And Quiz duzenle butonuna tiklar
    Then Quiz listesi sayfasina yonlendirilir

  @QuizzesSidebar
  Scenario: Delete quiz from list
    When List linkine tiklar
    And Quiz sil butonuna tiklar
    Then Quiz basariyla silinir
  @QuizzesSidebar @FurkanTest
  Scenario: View quiz results and manage student results
    When Results linkine tiklar
    Then Sonuclar sayfasina yonlendirilir
    And Istatistikler goruntulenebilmeli
    When Sonuclar icerisinde filtreleme yapar
    And Ogrenci sonucu goruntule butonuna tiklar
    Then Sonuclar sayfasina yonlendirilir

  @QuizzesSidebar
  Scenario: Delete student result
    When Results linkine tiklar
    And Ogrenci sonucu sil butonuna tiklar
    Then Sonuclar sayfasina yonlendirilir

  @QuizzesSidebar
  Scenario: View my quiz results
    When My Results linkine tiklar
    Then Kendi sonuclarim sayfasina yonlendirilir
    And Istatistikler goruntulenebilmeli
    When View answer butonuna tiklar
    Then Kendi sonuclarim sayfasina yonlendirilir

  @QuizzesSidebar
  Scenario: Access course from my results
    When My Results linkine tiklar
    And Course butonuna tiklar
    Then Kendi sonuclarim sayfasina yonlendirilir

  @QuizzesSidebar
  Scenario: View not participated quizzes and start quiz
    When Not Participated linkine tiklar
    Then Girilmeyen sinavlar sayfasina yonlendirilir
    When Start butonu tiklar
    Then Sinav basariyla baslatilir

  @QuizzesSidebar
  Scenario: Access course page from not participated quizzes
    When Not Participated linkine tiklar
    And Course page butonuna tiklar
    Then Girilmeyen sinavlar sayfasina yonlendirilir

  @QuizzesSidebar
  Scenario: Complete quiz creation and management flow
    When New Quiz linkine tiklar
    And Quiz Title alanina "Comprehensive Test" girer
    And Pass Mark alanina "70" girer
    And Quiz olustur butonuna tiklar
    When Add a multiple choice butonuna tiklar
    And Question title alanina "Test Question 1" girer
    And Grade alanina "15" girer
    And Correct answer olarak "Option A" secer
    And Soru kaydet butonuna tiklar
    When Add a Descriptive butonuna tiklar
    And Question title alanina "Test Question 2" girer
    And Grade alanina "25" girer
    And Description alanina "Explain the concept" girer
    And Correct answer description alanina "Detailed explanation" girer
    And Soru kaydet butonuna tiklar
    When List linkine tiklar
    Then Quiz listesi sayfasina yonlendirilir
    And Istatistikler goruntulenebilmeli 