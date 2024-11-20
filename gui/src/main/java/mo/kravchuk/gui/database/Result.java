package mo.kravchuk.gui.database;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class Result implements Serializable {
    public enum Status {
        OK,
        FAIL
    }

    private Status status;
    private String report;
    private Collection<Row> rows;

    Result(Status status) {
        this.status = status;
        report = "";
        rows = List.of();
    }

    public Status getStatus() {
        return status;
    }

    public String getReport() {
        return report;
    }

    Result setReport(String report) {
        this.report = report;
        return this;
    }

    public Collection<Row> getRows() {
        return rows;
    }

    Result setRows(Collection<Row> rows) {
        this.rows = rows;
        return this;
    }
}
