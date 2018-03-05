/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import FederalDB.FedException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tobias Habermann
 */
public class ParseException extends Exception
{

    private final List<String> errors;

    public List<String> getErrors()
    {
        return errors;
    }

    public ParseException(List<String> errors)
    {
        if (errors == null)
        {
            this.errors = new ArrayList<>();
        } else
        {
            this.errors = errors;
        }
    }

    @Override
    public String toString()
    {
        String text = "";
        text = errors.stream().map((error) -> error + "\n").reduce(text, String::concat);
        return text;
    }

}
