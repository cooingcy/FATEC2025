DELIMITER $

CREATE FUNCTION calcular_desconto(
    preco DECIMAL(10, 2),
    percentual_desconto DECIMAL(5, 2)
) RETURNS DECIMAL(10, 2) DETERMINISTIC

BEGIN
    DECLARE desconto DECIMAL(10, 2);
    DECLARE preco_final DECIMAL(10, 2);

    IF preco IS NULL OR percentual_desconto IS NULL 
        OR preco < 0 OR percentual_desconto < 0 
        OR percentual_desconto > 100 THEN
        RETURN NULL;
    END IF;

    SET desconto = preco * (percentual_desconto / 100);

    SET preco_final = preco - desconto;

    RETURN preco_final;
END
$
