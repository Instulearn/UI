
  Feature: US_039 (Student) Bilgilerini Instructor olarak değiştirebileceğim bir sayfa ister

    Scenario: TC_39.1 Student, anasayfasında 'Become An Instructor' butonunun görünürlüğü ve aktifliği testi
      Given Student anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then e-mail ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. url ' e gider.
      And ‘Become instructor’  butonunun olduğunu test eder
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar




    Scenario: TC_39.2 Student'ın, Become instructor sayfasında meslek secimi/secimleri yapabilmesi testi



    Scenario: TC_39.3 Student'ın gerekli form bilgileri doldurularak (Account type,Payout account,Identity scan) basarılı bir sekilde ınstructor olunabilmesi testi
