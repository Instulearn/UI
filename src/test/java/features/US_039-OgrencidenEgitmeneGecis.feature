
  Feature: US_039 (Student) Bilgilerini Instructor olarak değiştirebileceğim bir sayfa ister


    @kerem_us39 @kerem
    Scenario: TC_39.1 Student, anasayfasında 'Become An Instructor' butonunun görünürlüğü ve aktifliği testi
      Given student anasayfaya gider

      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then e-mail ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. url ' e gider.
      And ‘Become instructor’  butonunun olduğunu test eder
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar



    @kerem_us39
    Scenario: TC_39.2 Student'ın, Become instructor sayfasında meslek secimi/secimleri yapabilmesi testi
      Given student anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then e-mail ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. url ' e gider.
      And ‘Become instructor’  butonunun olduğunu test eder
      Then ‘Become instructor’  butonuna tıklar ve "https://qa.instulearn.com/become-instructor" adresine yönlendirilir
      And açılan sayfada "Occupations" başlığını görür ve meslek olarak 'Math’i seçer
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar



    @kerem_us39
    Scenario: TC_39.3 Student'ın gerekli form bilgileri doldurularak
    (Account type,Payout account,Identity scan) basarılı bir sekilde ınstructor olunabilmesi testi
      Given student anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then e-mail ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. url ' e gider.
      And ‘Become instructor’  butonunun olduğunu test eder
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar
