
  Feature: US_024 Kayıtlı bir kullanıcı olarak toplantılarımı yönetebileceğim bir sayfa olmasını istiyorum

    @kerem_024
    Scenario: TC_24.1 Instructor'ın 'Rezervasyonlarım', 'Taleplerim', 'Ayarlar' linkleri Dashboard sidebarında Toplantılar altında görünürlük ve aktiflik testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And instructor meetings linkinin altında yer alan My Reservations, Requests ve Settings linkleri görür ve aktif olduğunu test eder
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.2 Instructor'ın toplantı istatistik bilgilerinin Rezervasyonlar ikonu bağlantısı ile görünür olması ve var olan bir toplantısının görüntülenebilmesi, silinebilmesi ve düzenlenebilmesi testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And instructor Meetings linkinin altında yer alan My Reservations ikonuna tıklar ve Meeting statistics alanını görür
      When Meeting Statics bölümünün altında Filter Meetings başlığını görür ve 'Instructor : Seraphina Lawson’ seçer
      And Show Result butonuna tıklar ve ‘Meetings List’ başlığı atlınad "Seraphina Lawson"a ait bir toplantı listelendiğini görür
      Then seçili toplantının yanındaki üç nokta şeklinde olan bağlantıya tıkladığında, Edit ve Delete butonunun olduğunu görür ve sırası ile tıklar
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.3 Instructor'ın yalnızca açık toplantıları göster onay kutusu görünür ve seçilebilir olmalı testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And instructor Meetings linkinin altında yer alan My Reservations ikonuna tıklar
      Then dashboard body bölümünde Show Only Open Meetings yazısını görür ve yanındaki switch’e tıklar
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.4 Instructor meetinglerinin filtre simgeleri seçilebilirlik testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And instructor Meetings linkinin altında yer alan My Reservations ikonuna tıklar
      Then from, To, Day, Instructor, Status filtreleme seçenekleri görünür ve aktif olmalıdır
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.5 Instructor'ın toplantı istatistik bilgileri 'Talepler' linkine tıklandığında sayfada görüntülenmesi testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And meetings linkinin altında yer alan Requests ikonuna tıklar ve ilgili sayfaya yönlendirilir ve Meeting istatistik bilgilerini görüntüler
      Then dashboard sidebard'da yer alan Logout linkine tıklar

    @kerem_024
    Scenario: TC_24.6 Instructor'ın, toplantı talep listesinde filtrelenen toplantıları görüntülenebilmeli, seçilen toplantı üzerinde (Add to Calendar,Contact instructor,Finish meeting) gerekli işlemler yapılabilmelidir.
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And meetings linkinin altında yer alan Requests linkine tiklar
      Then meeting Statics bölümünün altında Filter Meetings başlığını görür ve Student : "Kerem Ceylan 2" seçer
      When Show Result butonuna tıklar ve Meeting requests list başlığı atlınad "Kerem Ceylan 2"e ait bir toplantı listelendiğini görür
      Then Seçili toplantının yanındaki üc nokta şeklinde olan butonda yer alan, Add to Calendar bağlantısına tıklar google calendar sayfasına yölendirilir
      And kullanıcı mevcut sayfayı kapatır ve Contact Student bağlantısına tıklar
      Then bağlantıya tıkladığında "Student contact information" bilgilendirme penceresi açılmalı ve kullanıcı ‘Close’ butonu ile bu pencereyi kapatmalıdır
      And ‘Finish Meeting’ bağlantısına tıklar
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.8 Instructor'ın, Toplantı sayfasında 'Ayarlar' bağlantısına tıklanarak güne ilişkin ayarlamalar (süre ekleme) yapılabilmesi testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And meetings linkinin altında yer alan Settings linkine tiklar ve ilgili sayfaya yonlendirilir
      And sayfada My timesheet alanını görür ve toplantı günlerini ayarlayacağı buton ‘Actions’ başlığı altında Add Time bağlantısı ile ayarlanır
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.9 Yüz yüze toplantılar için saatlik ücret seçimi, minimum ve maksimum katılımcı sayısını belirleyebilmelidir.
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And meetings linkinin altında yer alan Settings linkine tiklar ve ilgili sayfaya yonlendirilir
      And sayfada In-person meetings alanını görür ve yüz yüze toplantılarını bir switch yardımı ile ayarlar.
      Then yüz yüze görüşmelerini; saatlik ücret, minimum ve maksimum öğrencilere ait üç text alanı ile planlar
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.10 Toplantı sayfasında, grup toplantılarında saatlik ücret seçimi yapılırken, katılımcı sayısı için min ve maks sınır belirlenmesi testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And meetings linkinin altında yer alan Settings linkine tiklar ve ilgili sayfaya yonlendirilir
      And sayfada group alanını görür ve yüz yüze toplantılarını bir switch yardımı ile ayarlar.
      Then online grup toplantılarını ; Online Group Meeting Options başlığı altında saatlik ücret, minimum ve maksimum öğrencilere ait üç text alanı ile planlar
      And online grup toplantılarını ; In-person Group Meeting Options başlığı altında saatlik ücret, minimum ve maksimum öğrencilere ait üç text alanı ile planlar
      Then dashboard sidebard'da yer alan Logout linkine tıklar


    @kerem_024
    Scenario: TC_24.11 Instructor'ın toplantı sayfasında, grup toplantılarını düzenleme ekranında kaydet butonun görünürlüğü ve aktif olması testi
      Given visitor anasayfaya gider
      Then login butonuna tıklar ve loginUrl sayfasına yönlendirilir
      When "kerem.teacher@instulearn.com" ve password kutusuna geçerli bilgileri girer
      And login butonuna basar ve "Teacher" Panel' "https://qa.instulearn.com/panel" sayfasına yönlendirilir
      Then instructor Dashboard sidebarında Meetings linkini görür ve tıklar
      And meetings linkinin altında yer alan Settings linkine tiklar ve ilgili sayfaya yonlendirilir
      And sayfada tüm ayarları kayıt edeceği Save butonunu görür ve tıklar ve kaydın olduğunu doğrular
      Then dashboard sidebard'da yer alan Logout linkine tıklar

