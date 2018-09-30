package SkyscannerDataModel;

import gherkin.deps.com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;

/**
 * Created by abir on 30/09/18.
 */
public class SearchCriteriaReader {
    private static final Gson GSON = new Gson();

    public SearchCriteria getSearchCriteria (String dataType) {
        try {
            return GSON.fromJson(readFile(dataType), SearchCriteria.class);
        }
        catch (FileNotFoundException | URISyntaxException | NullPointerException e) {
            e.printStackTrace();
        }
        return new SearchCriteria("","",false,false);
    }

    private InputStreamReader readFile(String dataType) throws FileNotFoundException, URISyntaxException, NullPointerException {
        final String fileName = "SkyscannerDataModel" + File.separator + dataType.replaceAll(" ","_").toString() + ".json";
        final InputStream stream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        return new InputStreamReader(stream);
    }
}
