package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class RelatorioDAO {
    
    private final ArrayList<RelatorioDAO> minhaLista = new ArrayList<>();
    private final ConexaoDAO db;
    