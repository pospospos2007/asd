package lab2;

/**
 * Created by Wenqiang on 5/1/18.
 */
public class Client2 {
}
interface ITable {
    public int numOfRows();
    public IRow getRow(int rowNum);
    public void addRow(IRow row, int rowNum); //add row at the end
    public void modifyRow(int rowNum, IRow row);
    public void deleteRow(int rowNum);
}
interface IRow {
//the interface a concrete Row class implements ...
}

class Table implements  ITable{
    @Override
    public int numOfRows() {
        return 0;
    }

    @Override
    public IRow getRow(int rowNum) {
        return null;
    }

    @Override
    public void addRow(IRow row, int rowNum) {

    }

    @Override
    public void modifyRow(int rowNum, IRow row) {

    }

    @Override
    public void deleteRow(int rowNum) {

    }
}

class TableProxy implements ITable{

    private Table table ;

    TableProxy(){
        table = new Table();
    }

    @Override
    public int numOfRows() {
        return 0;
    }

    @Override
    public IRow getRow(int rowNum) {
        return null;
    }

    @Override
    public void addRow(IRow row, int rowNum) {

    }

    @Override
    public void modifyRow(int rowNum, IRow row) {

    }

    @Override
    public void deleteRow(int rowNum) {

    }
}


