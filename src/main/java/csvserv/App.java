package csvserv;



import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import csvserv.Entities.PriceitemsEntity;
import csvserv.Servises.CSVParseServise;
import csvserv.Servises.PriceitemsEntityService;

import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Парсер из .csv файла в объект List<Data> (класс-сущность Data)
 *
 */
public class App 
{

    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) throws Exception {
        /*
        CSVReader csvReader = new CSVReader(
                new FileReader("src/main/resources/10953.csv"),';', '"', 1);

        String nextLine [];
        while ((nextLine = csvReader.readNext()) != null) {
            if (nextLine != null) {
                System.out.println(Arrays.toString(nextLine));
            }
        }*/


        // Статегия разметки(парсинг .csv в List<Data>)

        /*
        List<Data> list = new CsvToBeanBuilder(new FileReader("src/main/resources/10953.csv")).
                withSkipLines(1).
                withSeparator(';').
                withFieldAsNull(CSVReaderNullFieldIndicator.NEITHER).
               withQuoteChar('"').
                withType(Data.class).
                build().
                parse();

        for (Object object : list) {
            Data data = (Data) object;
            System.out.println(data.toString());
        }

    */
        // Тестово добавляем запись в БД
        /*
        PriceitemsEntityService peServise = new PriceitemsEntityService();
        PriceitemsEntity pe = new PriceitemsEntity(
                "Некий вендор",
                "Некий номер",
                "Поисквендор",
                "Поискномер",
                "Описалово",
                new BigDecimal("1.556"),
                45);
        peServise.savePriceitem(pe);
*/

        CSVParseServise servise = new CSVParseServise();
        List<Data> listData = servise.getDataList("src/main/resources/10953.csv");
        for (Object object : listData) {
            Data data = (Data) object;
            System.out.println(data.toString());
        }
    }
}
