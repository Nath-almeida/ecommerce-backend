INSERT INTO categoria (nome, descricao) VALUES ('Livros', 'Livros Técnicos e Literários');
INSERT INTO categoria (nome, descricao) VALUES ('Eletrônicos', 'Smartphones e Gadgets');
INSERT INTO categoria (nome, descricao) VALUES ('Escritório', 'Material de Escritório');
INSERT INTO categoria (nome, descricao) VALUES ('Informática', 'Computadores e Periféricos');
INSERT INTO categoria (nome, descricao) VALUES ('Casa', 'Artigos para o Lar');

INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Código Limpo', 'Livro Robert Martin', 73.44, 20, 1);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Smartphone Pro', '128GB Android', 1500.00, 10, 2);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Cadeira Ergonômica', 'Encosto preto', 450.00, 5, 3);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Teclado Mecânico', 'Switch Azul', 250.00, 15, 4);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Liquidificador', '110V Inox', 120.00, 8, 5);

INSERT INTO cliente (nome, email, telefone) VALUES ('João Silva', 'joao@email.com', '11999999999');
INSERT INTO cliente (nome, email, telefone) VALUES ('Maria Souza', 'maria@email.com', '11988888888');
INSERT INTO cliente (nome, email, telefone) VALUES ('Carlos Alberto', 'carlos@email.com', '11977777777');
INSERT INTO cliente (nome, email, telefone) VALUES ('Ana Beatriz', 'ana@email.com', '11966666666');
INSERT INTO cliente (nome, email, telefone) VALUES ('Lucas Mendes', 'lucas@email.com', '11955555555');

INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES ('2023-10-01 10:00:00', 'Aprovado', 73.44, 1);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES ('2023-10-02 11:30:00', 'Pendente', 1500.00, 2);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES ('2023-10-03 14:15:00', 'Aprovado', 900.00, 3);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES ('2023-10-04 16:45:00', 'Cancelado', 250.00, 4);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES ('2023-10-05 09:10:00', 'Aprovado', 120.00, 5);

INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 73.44, 1, 1);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 1500.00, 2, 2);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (2, 450.00, 3, 3);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 250.00, 4, 4);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 120.00, 5, 5);

INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (73.44, '2023-10-01 10:05:00', 'Aprovado', 'PIX', 1);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (1500.00, '2023-10-02 11:35:00', 'Pendente', 'Boleto', 2);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (900.00, '2023-10-03 14:20:00', 'Aprovado', 'Cartão de Crédito', 3);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (250.00, '2023-10-04 16:50:00', 'Cancelado', 'PIX', 4);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (120.00, '2023-10-05 09:15:00', 'Aprovado', 'Cartão de Débito', 5);