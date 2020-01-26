package csvserv.Servises;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import csvserv.Data;

import java.io.FileReader;
import java.util.List;

public class CSVParseServise {
// Статегия разметки(парсинг .csv в List<Data>)
// "src/main/resources/10953.csv"

    public List<Data> getDataList(String path) throws Exception{
        List<Data> dataList = new CsvToBeanBuilder(new FileReader(path)).
                withSkipLines(1).
                withSeparator(';').
                withFieldAsNull(CSVReaderNullFieldIndicator.NEITHER).
                withQuoteChar('"').
                withType(Data.class).
                build().
                parse();
        return dataList;
    }

                }


