/** 
 * javaにおける時間の取り扱い
 * java.util.Dateクラスを利用する
 * ただし、人間が使いにくために、java.util.Calendarやjava.text.SimpleDateFormatクラスを利用する
 * DateやCalendarクラスにも限界がある
 * 最少でも「ミリ秒単位」でしか時間を扱えない
 * 日常利用する曖昧な日時を表せない。時間の幅をあらわせない
 * 
 * 
 * 日時を表すクラスはたくさんあるが、いずれも時間軸上のある時点を指し示している。
 * そのため、これらのクラスは全てjava.time.Temporalインターフェースを実装している
 * 共通メソッド -> now()現在日時からインスタンを生成 of() 他の種類からインスタンスを生成 of~(), parse() 文字列からインスタンを生成
 */
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
import java.time.format.DateTimeFormatter;

public class Datetime {
  public static void main(String[] args) {
    // DateクラスとCalendarクラスの利用
    Date now = new Date(); // 引数なしでインスタンス化すると、現在の日時情報が格納される
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1216622225935L);
    System.out.println(past);

    // 正確な時間を提供するInstantクラス
    // それぞれの現地時間を表示するZonedDateTimeクラス
    Instant i1 = Instant.now(); // 現在日時を取得
    Instant i2 = Instant.ofEpochMilli(31920291332L);
    long l = i2.toEpochMilli();

    // ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

    // InstantとZondedDateTimeの相互変換
    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    // ZonedDatetimeの利用
    System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
    System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
    // 同じsyん感の判定には、isEqualを使う
    if (z2.isEqual(z3)){
      System.out.println("これらは同じ瞬間をさしています");
    }


    System.out.println("================================");
    System.out.println("曖昧な時間の利用");
    System.out.println("================================");

    // LocalDateTimeクラス
    LocalDatetime local1 = LocalDateTime.now(); //現在日時を取得
    LocalDateTime local2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);

    // LocalDatetimeとZonedDatetimeの相互変換
    ZonedDateTime z1 = local2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime local3 = z1.toLocalDateTime();

    System.out.println("================================");
    System.out.println("日時クラスのメソッド");
    System.out.println("================================");

    // 文字列からLocalDateを生成
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyy/MM/dd");
    LocalDate ld = LocalDate.parse("2011/08/21", dateFormat);

    // 1000日後を計算
    ld = ld.plusDays(1000);
    String str = ld.format(dateFormat);
    System.out.println("1000日後は" + str);

    // 現在日時との比較
    LocalDate now = Localdate.now();
    if (now.isAfter(d)) {
      System.out.println("nowはldより新しい");
    }

    System.out.println("================================");
    System.out.println("時間や期間を表すクラス");
    System.out.println("================================");
    // DurationクラスとPeriodクラス
    LocalDate ld1 = LocalDate.of(2019, 10, 24);
    LocalDate ld2 = LocalDate.of(2019, 10, 30);

    // 3日間を表すPeriodを2つの方法で生成
    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(ld1, ld2);
    // ld2のさらに3日後を計算する
    LocalDate ld3 = ld2.plus(p2);

    System.out.println("================================");
    System.out.println("練習問題");
    System.out.println("================================");
    Date dateNow = new Date();
    Calendar calNow = Calendar.getInstance();
    calNow.setTime(dateNow);
    int day = calNow.get(Calendar.DAY_OF_MONTH);
    day += 100;
    calNow.set(Calendar.DAY_OF_MONTH, day);
    Date future = calNow.getTime();
    SimpleDateFormat dateCalFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(dateCalFormat.format(future));

    LocalDate local1 = LocalDate.now();
    LocalDate futureLocal = local1.plusDays(100);
    DateTimeFormatter formateDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    System.out.println(futureLocal.format(formateDate));
  }
}