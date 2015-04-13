package com.method;

import java.util.List;

import org.jsoup.nodes.Document;

import com.cls.Shop;

public abstract class ParserAbstract {
	public abstract Document getPage(String uri);
	public abstract List<Shop> parse(Document document);
}
