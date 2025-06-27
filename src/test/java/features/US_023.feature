
 Feature: Instructors olarak kurs paketi oluşturulup yönetilir

   Scenario: TC_23.1 Dashboard sideBar'da Course Bundles menü başlığı altındaki 'New' linkinin aktiflik testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then dashboard sideBar da course bundles butona tıklanır
     Then açılan menüde new linkine tıklanır
     And  ilgili sayfanın açıldığı doğrulanır

   Scenario:  TC_23.2 New Course sayfasında Basic Info icin Gerekli Form Bilgilerinin girileceği alanların testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then dashboard sideBar da course bundles butona tıklanır
     Then açılan menüde new linkine tıklanır
     Then basic info altındaki Title text box'ına ilgili data girilir
     Then basic info altındaki SEO Meta Description text box'ına ilgili data girilir
     Then thumbnail text box'a ilgili data girilir
     Then cover image text box'ına ilgili data girilir
     Then sayfa aşağıya çekilir
     Then Basic info altındaki Description text box'ına tıklanır ve ilgili data girilir.
     And  next butonuna tıklanır

   Scenario: TC_23.3 Private, Next, Previous, Send for Review, Save as Draft, Delete butonları aktiflik testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then dashboard sideBar da course bundles butona tıklanır
     Then açılan menüde new linkine tıklanır
     Then basic info altındaki Title text box'ına ilgili data girilir
     Then basic info altındaki SEO Meta Description text box'ına ilgili data girilir
     Then thumbnail text box'a ilgili data girilir
     Then cover image text box'ına ilgili data girilir
     Then sayfa aşağıya çekilir
     Then Basic info altındaki Description text box'ına tıklanır ve ilgili data girilir.
     And  next butonuna tıklanır
     Then previous butonu görüntülenir
     Then next butonu görüntülenir
     And  send for review görüntülenir
     Then save as draft görüntülenir

   Scenario: TC_23.4 Extra Information için gerekli form bilgileri düzenleme testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then extra information sayfasına gidilir
     Then category text box'ına tıklanır
     Then dıgıtal marketing linkine tıklanır
     And  next butonuna tıklanır


   Scenario:  TC_23.5 Pricing başlığı altında ödeme formu doldurulup ödeme planı oluşturabilme testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then ilgili sayfaya gider
     Then enable subscribe button'a tıklar
     Then access period text box'a ilgili data girilir
     Then price text box'a ilgili data girilir
     And  next butonuna tıklanır

   Scenario: TC_23.6 Content başlığı altında kurs içeriği oluşturabilme testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then ilgili sayfa content e gider
     Then add course butonuna tıklar
     Then açılan sayfada select a course text box'ına ilgili data girilir
     Then save butonuna tıklar
     And  next butonuna tıklanır

   Scenario: TC_23.7 Sık Sorulan Sorular başlığı altındaki bilgilerin opsiyonel olarak yeni olusturulabilme testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then FAQ sayfasına gider
     Then new faq butonuna tıklanır
     Then title text box'a ilgili data girilir
     Then answer text box'a ilgili data girilir
     And  faq save butonuna tıklanır
     And  next butonuna tıklanır

   Scenario: TC_23.8 Message to Reviewer başlığı altında mesaj gönderilebilme ve
   I agree with terms & rules check box görünürlük ve aktiflik testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then message to reviewer sayfasına gidilir
     Then message to reviewer text box'ına ilgili data girilir
     Then I agree with terms & rules butona tıklanır
     Then send for review butona tıklanır

   Scenario:  TC_23.9 Oluşturulan paketin listede görüntülenebilme testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then course bundles başlığına tıklar
     Then açılan menüde my bundles başlığına tıklar
     Then cucumber lesson 1 adlı paket görüntüler ve doğrular

   Scenario: TC_23.10 Dashboard sideBar'da Course Bundles menü başlığı altında 'My Bundles'
   linkinin görünür ve aktif olabilmesi testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then course bundles menü başlığına tıklar
     Then açılan menüde ki my bundles link başlığının görünürlüğünü doğrular

   Scenario:  TC_23.11 My Bundles linkine tıklandığında açılan listede kurs paketleri
   görüntülenmeli listeden seçilen kurs paketinin üzerinde ilgili işlemlerin yapılabilmesi testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then course bundles başlığına tıklar
     Then açılan menüde my bundles başlığına tıklar
     Then course bölümünün sol üstteki 3 noktaya tıklar
     Then açılan sayfada edit linkinin görünürlüğünü test eder
     Then courses linkinin görünürlüğünü test eder
     Then export students list linkinin görünürlüğünü test eder
     Then delete linkinin görünürlüğünü test eder



