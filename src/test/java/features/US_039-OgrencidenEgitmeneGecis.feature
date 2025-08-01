
  Feature: US_039 (Student) Bilgilerini Instructor olarak değiştirebileceğim bir sayfa ister


    @kerem_us39
    Scenario: TC_39.1 Student, anasayfasında 'Become An Instructor' butonunun görünürlüğü ve aktifliği testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve ‘Student Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. anasayfaya gider.
      And ‘Become instructor’  butonunun olduğunu test eder
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar



    @kerem_us39
    Scenario: TC_39.2 Student'ın, Become instructor sayfasında meslek secimi/secimleri yapabilmesi testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      Then "kerem.student0@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Student" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then kullanıcı header bölümündeki ‘Home’ butonuna tıklar. anasayfaya gider.
      And ‘Become instructor’  butonunun olduğunu test eder
      Then ‘Become instructor’  butonuna tıklar ve "https://qa.instulearn.com/become-instructor" adresine yönlendirilir
      And açılan sayfada "Occupations" başlığını görür ve meslek olarak 'Math’i seçer
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar



    @kerem_us39
    Scenario: TC_39.3 Student'ın gerekli form bilgileri doldurularak
    (Account type,Payout account,Identity scan) basarılı bir sekilde ınstructor olunabilmesi testi
      Given visitor anasayfaya gider
      When anasayfada register butonuna basar ve "https://qa.instulearn.com/register" sayfasina yönlendirilir
      Then faker ile yeni bir email üretip password ile giriş yapar
      And ‘Become instructor’  butonunun olduğunu test eder
      Then ‘Become instructor’  butonuna tıklar ve "https://qa.instulearn.com/become-instructor" adresine yönlendirilir
      And açılan sayfada "Occupations" başlığını görür ve meslek olarak 'Math’i seçer
      Then account Type select menü'den instructorı seçer
      And ‘Payout account’ select menüden ‘Stripe’ seçer
      Then Açılan bölümde Account Holder kısmına "John Doe" , Account ID kısmına "4242" bilgilerini girer
      And Identity Scan bölümüne "/store/1588/SDET Certificated.docx" bilgilerini girer
      Then Send a request butonuna basar
      Then Açılan sayfada create a course butonunu görür ve başarılı kayıt yapığı teyit eder
      And  header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar
