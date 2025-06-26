
Feature: US_040 Kayıtlı bir kullanıcı (Student) olarak kendime ait dashboard sayfası olmasını istiyorum

  @kerem_us40
  Scenario: TC_40.1 Student anasayfasında dashboard sayfasına giden bir link olması testi
    Given student anasayfaya gider
    Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
    Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
    And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
    Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. anasayfaya gider.
    And header bölümündeki profil ismine tıklar, açılan menüde dashboard'a tıklar
    Then kullanıcı ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
    And  dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_us40
  Scenario: TC_40.2 Student dashbordundaki sidebar'da "Courses,Meetings,Quizzes,Certificates,Financial,
  Support,Notifications,Settings,Log Out" linkleri görünür ve aktif olması testi
    Given student anasayfaya gider
    Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
    Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
    And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
    Then dashboard sidebar’da Courses,Meetings,Quizzes,Certificates,Financial,Support,Notifications,Settings,Log Out" linkleri görür ve aktif olduğunu test eder
    And  dashboard sidebard'da yer alan Logout linkine tıklar


  @kerem_us40
  Scenario: TC_40.3 Student dashboard sayfasında tüm etkinleri görüntüleyebilecek View All Events Linki görünür ve aktif olması testi
    Given student anasayfaya gider
    Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
    Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
    And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
    And acilan sayfada "View all events" basligini gorur
    And  dashboard sidebard'da yer alan Logout linkine tıklar


  @kerem_us40
  Scenario: TC_40.4 Student dashboard body bölümünde "Account Balance,Purchased Courses,Meetings,Support Messages,Comments"
   linkleri görünür ve aktif olması testi
    Given student anasayfaya gider
    Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
    Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
    And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
    And dashboard board bölümünde yer alan Account Balance, Charge Account, Purchased Courses, Support Messages, Meetings ve Comments bağlantılarının görünür ve aktif olduğunu test eder
    And dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_us40
    Scenario: TC_40.5 Student ilan boardunda güncel ilanlar ve detaylı bilgilerin görüntülenebilmesi testi
      Given student anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      And acilan sayfada Noticeboard bolumunun oldugunu test eder
      Then noticeboard bölümünde "New Year Sales Festival" ilanının olduğunu test eder
      When New Year Sales Festival ilanının yanında More İnfo butonunu görünür ve aktif olduğunu test eder
      And More info butonuna tıklar ve açılan bilgilendirme penceresinde "Due to the New Year Festival, users who buy more than $ 200 will be given a 20% discount code." notunu okur
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. anasayfaya gider.
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar


  @kerem_us40 @wip_kc
  Scenario: TC_40.6 Student aylık öğrenme tablosu görüntülenmesi testi
    Given student anasayfaya gider
    Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
    Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
    And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
    And acilan sayfada Learning Statics bolumunun oldugunu test eder
    And dashboard sidebard'da yer alan Logout linkine tıklar
