package fossils.fossils.client.blockentity.model.kentrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;

@SuppressWarnings("unused")
public class KentrosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart tail2;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart tail5;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart body2;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart upperbody;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart spike;
	private final ModelPart spike2;
	private final ModelPart neck;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart neck2;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck3;
	private final ModelPart leftPlate24;
	private final ModelPart rightPlate24;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;

	public KentrosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.leftPlate9 = this.body.getChild("leftPlate9");
		this.rightPlate9 = this.body.getChild("rightPlate9");
		this.leftPlate10 = this.body.getChild("leftPlate10");
		this.rightPlate10 = this.body.getChild("rightPlate10");
		this.tail = this.body.getChild("tail");
		this.leftPlate11 = this.tail.getChild("leftPlate11");
		this.rightPlate11 = this.tail.getChild("rightPlate11");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate12 = this.tail2.getChild("leftPlate12");
		this.rightPlate12 = this.tail2.getChild("rightPlate12");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate13 = this.tail4.getChild("leftPlate13");
		this.rightPlate13 = this.tail4.getChild("rightPlate13");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftPlate14 = this.tail5.getChild("leftPlate14");
		this.rightPlate14 = this.tail5.getChild("rightPlate14");
		this.body2 = this.body.getChild("body2");
		this.leftPlate7 = this.body2.getChild("leftPlate7");
		this.rightPlate7 = this.body2.getChild("rightPlate7");
		this.leftPlate8 = this.body2.getChild("leftPlate8");
		this.rightPlate8 = this.body2.getChild("rightPlate8");
		this.upperbody = this.body2.getChild("upperbody");
		this.leftPlate5 = this.upperbody.getChild("leftPlate5");
		this.rightPlate5 = this.upperbody.getChild("rightPlate5");
		this.leftPlate6 = this.upperbody.getChild("leftPlate6");
		this.rightPlate6 = this.upperbody.getChild("rightPlate6");
		this.spike = this.upperbody.getChild("spike");
		this.spike2 = this.upperbody.getChild("spike2");
		this.neck = this.upperbody.getChild("neck");
		this.leftPlate4 = this.neck.getChild("leftPlate4");
		this.rightPlate4 = this.neck.getChild("rightPlate4");
		this.neck2 = this.neck.getChild("neck2");
		this.leftPlate2 = this.neck2.getChild("leftPlate2");
		this.rightPlate2 = this.neck2.getChild("rightPlate2");
		this.leftPlate3 = this.neck2.getChild("leftPlate3");
		this.rightPlate3 = this.neck2.getChild("rightPlate3");
		this.neck3 = this.neck2.getChild("neck3");
		this.leftPlate24 = this.neck3.getChild("leftPlate24");
		this.rightPlate24 = this.neck3.getChild("rightPlate24");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.frontleftleg2 = this.upperbody.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.upperbody.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.3F, 13.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 27).addBox(-0.5F, -3.4227F, -0.1129F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -2.3F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 104).addBox(-0.5F, -3.4227F, -0.8129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -4.3F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 84).mirror().addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1562F, 8.1948F, 4.0771F, -1.3056F, 0.1952F, 0.0595F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 34).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -1.0494F, -4.2948F, 0.1984F, 0.0049F, 1.7897F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 109).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -1.0494F, -4.2948F, 0.0386F, 0.2146F, 0.44F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-0.5F, -1.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1518F, 1.3085F, -4.7369F, -0.1069F, 0.7629F, -0.0594F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(87, 21).mirror().addBox(0.0765F, 2.0173F, -1.3386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(63, 11).mirror().addBox(0.0765F, 0.0173F, -2.3386F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2171F, -1.7141F, -3.7833F, 0.3818F, 0.7629F, -0.0594F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
		.texOffs(80, 21).addBox(3.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, -1.0717F, -1.038F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5561F, 0.0061F, -2.724F, 0.3154F, 0.6214F, -0.0621F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(0.0F, -0.2222F, -3.0757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -1.3927F, 1.1028F, -0.2537F, -0.6772F, 0.1883F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 106).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
		.texOffs(66, 97).mirror().addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
		.texOffs(92, 106).addBox(3.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
		.texOffs(66, 97).addBox(3.5F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 1.9332F, -0.8182F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0732F, 1.8951F, -1.5592F, -0.4041F, 0.2434F, -0.0217F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(77, 94).mirror().addBox(-2.08F, -1.0794F, -0.8034F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
		.texOffs(58, 94).mirror().addBox(-2.08F, -1.0794F, -0.5034F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.0F, 1.9F, 0.5524F, 0.083F, -0.553F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(98, 102).mirror().addBox(-0.5832F, -2.1869F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 6.0F, 3.7F, 0.6048F, -0.0829F, -0.2257F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(102, 69).mirror().addBox(-0.5F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3356F, 3.1237F, 2.248F, 0.0637F, 0.083F, -0.553F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 26).mirror().addBox(-0.6059F, -0.25F, -0.4307F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 5.1F, 2.3F, -0.8634F, 0.2102F, 0.0735F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.5761F, -0.0353F, -1.0331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 6.7F, 5.5F, 0.2033F, -0.0829F, -0.2257F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.5361F, -0.1407F, 0.0526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 6.1F, 3.4F, 0.7793F, -0.0829F, -0.2257F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-1.3F, -0.5563F, -3.1816F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 0).addBox(0.7F, -0.5563F, -3.1816F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 74).mirror().addBox(-2.3F, -0.4296F, -1.9214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 74).addBox(1.7F, -0.4296F, -1.9214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(81, 80).mirror().addBox(-0.5662F, 0.0173F, -1.724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2171F, -1.7141F, -3.7833F, 0.3419F, 0.3378F, -0.1742F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(51, 57).mirror().addBox(-2.0318F, -0.2338F, -2.8678F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.9F, -2.0F, 0.0536F, 0.6214F, -0.0621F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-3.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(87, 106).mirror().addBox(-2.3F, 1.2089F, 0.2505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
		.texOffs(11, 63).mirror().addBox(-2.3F, -0.7911F, -1.7495F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
		.texOffs(11, 63).addBox(1.7F, -0.7911F, -1.7495F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F))
		.texOffs(87, 106).addBox(1.7F, 1.2089F, 0.2505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
		.texOffs(0, 59).addBox(1.7F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(81, 76).mirror().addBox(-2.3F, -2.4471F, 1.6567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(81, 76).addBox(1.7F, -2.4471F, 1.6567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 47).mirror().addBox(-5.3F, -1.7158F, -0.5907F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 47).addBox(1.7F, -1.7158F, -0.5907F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 84).mirror().addBox(-3.6562F, -2.4471F, -0.2072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.7518F, 0.3991F, -0.3485F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(-2.3F, -1.7009F, 2.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(7, 90).addBox(1.7F, -1.7009F, 2.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.5F, -1.4F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(5, 64).addBox(3.5F, -1.4F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.8915F, 2.7561F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(110, 53).mirror().addBox(-2.3F, -0.2274F, 1.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
		.texOffs(110, 53).addBox(1.7F, -0.2274F, 1.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(-2.3F, -0.5759F, -2.4778F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(60, 79).addBox(1.7F, -0.5759F, -2.4778F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-0.6369F, 0.3108F, -5.4607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.8F, 0.7F, 0.1582F, 0.5715F, 0.0311F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(82, 106).mirror().addBox(-1.7962F, -0.5574F, -3.3511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.8F, 0.7F, 0.3988F, 0.2434F, -0.0217F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 88).mirror().addBox(-2.099F, -0.2503F, -1.0551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5F, -0.5F, -0.6529F, 0.324F, -0.2859F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(-1.5031F, 0.0176F, -0.7118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.3F, 0.7F, -0.797F, 0.3956F, -0.1697F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-1.3264F, 2.1353F, -0.3359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.0F, 1.9F, 0.4651F, -0.0829F, -0.2257F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 103).addBox(-0.4239F, -0.0353F, -1.0331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 6.7F, 5.5F, 0.2033F, 0.0829F, 0.2257F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(103, 0).addBox(-0.4639F, -0.1407F, 0.0526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 6.1F, 3.4F, 0.7793F, 0.0829F, 0.2257F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(98, 102).addBox(-0.4168F, -2.1869F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 6.0F, 3.7F, 0.6048F, 0.0829F, 0.2257F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 103).addBox(0.3264F, 2.1353F, -0.3359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.0F, 1.9F, 0.4651F, 0.0829F, 0.2257F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 84).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1562F, 8.1948F, 4.0771F, -1.3056F, -0.1952F, -0.0595F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(53, 26).addBox(-0.3941F, -0.25F, -0.4307F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2F, 5.1F, 2.3F, -0.8634F, -0.2102F, -0.0735F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 16).addBox(0.5031F, 0.0176F, -0.7118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2F, 3.3F, 0.7F, -0.797F, -0.3956F, 0.1697F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(102, 69).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3356F, 3.1237F, 2.248F, 0.0637F, -0.083F, 0.553F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(77, 94).addBox(1.08F, -1.0794F, -0.8034F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F))
		.texOffs(58, 94).addBox(1.08F, -1.0794F, -0.5034F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.0F, 1.9F, 0.5524F, -0.083F, 0.553F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 88).addBox(1.099F, -0.2503F, -1.0551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 2.5F, -0.5F, -0.6529F, -0.324F, 0.2859F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 84).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0732F, 1.8951F, -1.5592F, -0.4041F, -0.2434F, 0.0217F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(82, 106).addBox(0.7962F, -0.5574F, -3.3511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8F, 0.7F, 0.3988F, -0.2434F, 0.0217F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(34, 87).addBox(-0.3631F, 0.3108F, -5.4607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8F, 0.7F, 0.1582F, -0.5715F, -0.0311F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 84).addBox(2.6562F, -2.4471F, -0.2072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, 0.2F, 1.1F, -0.7518F, -0.3991F, 0.3485F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 6).addBox(-2.0F, -0.2222F, -3.0757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -1.3927F, 1.1028F, -0.2537F, 0.6772F, -0.1883F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(67, 79).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5561F, 0.0061F, -2.724F, 0.3154F, -0.6214F, 0.0621F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 57).addBox(0.0318F, -0.2338F, -2.8678F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.9F, -2.0F, 0.0536F, -0.6214F, 0.0621F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(81, 80).addBox(-0.4338F, 0.0173F, -1.724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.2171F, -1.7141F, -3.7833F, 0.3419F, -0.3378F, 0.1742F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(112, 34).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -1.0494F, -4.2948F, 0.1984F, -0.0049F, -1.7897F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(42, 109).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -1.0494F, -4.2948F, 0.0386F, -0.2146F, -0.44F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(80, 31).addBox(-0.5F, -1.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.1518F, 1.3085F, -4.7369F, -0.1069F, -0.7629F, 0.0594F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(87, 21).addBox(-1.0765F, 2.0173F, -1.3386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(63, 11).addBox(-1.0765F, 0.0173F, -2.3386F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2171F, -1.7141F, -3.7833F, 0.3818F, -0.7629F, 0.0594F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 1.0F, -0.75F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(15, 52).addBox(0.0F, 0.5487F, -0.4449F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.1235F, 1.0816F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r59 = backleftleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(29, 57).addBox(0.25F, -5.0F, 2.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r60 = backleftleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(60, 35).addBox(0.25F, -3.0F, 1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(73, 27).addBox(-0.5F, -0.3527F, -0.9304F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 11.0329F, 0.6527F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r61 = backleftleg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 63).addBox(-0.4255F, -0.2538F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, -0.3027F, 0.5696F, 0.0697F, -0.003F, 0.0435F));

		PartDefinition cube_r62 = backleftleg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(82, 26).addBox(-1.0F, -0.6241F, -1.5383F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 1.9696F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r63 = backleftleg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 73).addBox(-1.0F, -5.388F, 0.2393F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r64 = backleftleg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(70, 5).addBox(-1.0F, 1.6F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
		.texOffs(66, 27).addBox(-1.0F, -3.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0119F, 7.4272F, 1.5844F, -0.6534F, -0.0084F, -0.0044F));

		PartDefinition cube_r65 = backleftleg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(76, 43).addBox(-1.5F, -2.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0119F, 1.6211F, -1.2246F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5119F, 1.2232F, -0.9138F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r66 = backleftleg4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(46, 13).addBox(-2.5F, -0.1F, -1.7F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2358F, -1.3451F, 0.4363F, 0.0041F, -0.0005F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(22, 52).addBox(-2.0F, 0.5487F, -0.4449F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.1235F, 1.0816F, 0.3053F, -0.043F, 0.0076F));

		PartDefinition cube_r67 = backrightleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 57).addBox(-3.25F, -5.0F, 2.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r68 = backrightleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(61, 0).addBox(-3.25F, -3.0F, 1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(73, 39).addBox(-1.5F, -0.3527F, -0.9304F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 11.0329F, 0.6527F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r69 = backrightleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5745F, -0.2538F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, -0.3027F, 0.5696F, 0.0697F, 0.003F, -0.0435F));

		PartDefinition cube_r70 = backrightleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(82, 36).addBox(-1.0F, -0.6241F, -1.5383F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 1.9696F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r71 = backrightleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(32, 74).addBox(-1.0F, -5.388F, 0.2393F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r72 = backrightleg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(71, 34).addBox(-1.0F, 1.6F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
		.texOffs(38, 67).addBox(-1.0F, -3.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0119F, 7.4272F, 1.5844F, -0.9589F, 0.0084F, 0.0044F));

		PartDefinition cube_r73 = backrightleg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 55).addBox(-1.5F, -2.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0119F, 1.6211F, -1.2246F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5119F, 1.2232F, -0.9138F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r74 = backrightleg4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 18).addBox(-2.5F, -0.1F, -1.7F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2358F, -1.3451F, 0.4363F, -0.0041F, 0.0005F));

		PartDefinition leftPlate9 = body.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7069F, -5.1749F, -2.9781F, -0.0682F, 0.1095F, 0.2063F));

		PartDefinition cube_r75 = leftPlate9.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(7, 81).addBox(-0.5F, -1.8857F, -1.9539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -1.2057F, 2.2046F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftPlate9.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(28, 89).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -1.2612F, 1.1062F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftPlate9.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(100, 65).addBox(-0.5F, -0.8403F, -0.7576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.3057F, 2.0046F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftPlate9.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(100, 55).addBox(-0.5F, -1.7017F, -0.7475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.6943F, 0.7046F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftPlate9.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 4).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftPlate9.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(43, 100).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftPlate9.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 92).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -1.342F, 0.5749F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftPlate9.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(81, 16).addBox(-0.4848F, -0.2261F, -1.761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1026F, -3.5404F, 3.3739F, -0.5564F, 0.0147F, -0.0112F));

		PartDefinition cube_r83 = leftPlate9.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(38, 100).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1026F, -4.2404F, 2.8739F, 0.0544F, 0.0147F, -0.0112F));

		PartDefinition cube_r84 = leftPlate9.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(79, 100).addBox(-0.5F, -1.8077F, -0.2159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0739F, -4.338F, 2.02F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftPlate9.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -3.8554F, 0.3034F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.3698F, 1.3314F, -0.4189F, 0.0F, 0.0F));

		PartDefinition rightPlate9 = body.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7069F, -5.1749F, -2.9781F, -0.0682F, -0.1095F, -0.2063F));

		PartDefinition cube_r86 = rightPlate9.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(7, 81).mirror().addBox(-0.5F, -1.8857F, -1.9539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2057F, 2.2046F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightPlate9.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(28, 89).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2612F, 1.1062F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightPlate9.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(100, 65).mirror().addBox(-0.5F, -0.8403F, -0.7576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.3057F, 2.0046F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightPlate9.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(100, 55).mirror().addBox(-0.5F, -1.7017F, -0.7475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.6943F, 0.7046F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightPlate9.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(86, 4).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightPlate9.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(43, 100).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightPlate9.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 92).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.342F, 0.5749F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightPlate9.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-0.5152F, -0.2261F, -1.761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -3.5404F, 3.3739F, -0.5564F, -0.0147F, 0.0112F));

		PartDefinition cube_r94 = rightPlate9.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(38, 100).mirror().addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -4.2404F, 2.8739F, 0.0544F, -0.0147F, 0.0112F));

		PartDefinition cube_r95 = rightPlate9.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(79, 100).mirror().addBox(-0.5F, -1.8077F, -0.2159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -4.338F, 2.02F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightPlate9.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -3.8554F, 0.3034F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.3698F, 1.3314F, -0.4189F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = body.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9534F, -4.573F, 4.9109F, -0.4173F, 0.1095F, 0.2063F));

		PartDefinition cube_r97 = leftPlate10.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(92, 89).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftPlate10.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(94, 29).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftPlate10.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(90, 8).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftPlate10.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.9056F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftPlate10.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(101, 24).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftPlate10.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(110, 13).addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F))
		.texOffs(110, 3).addBox(0.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-0.3739F, 1.0416F, 0.6381F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftPlate10.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(88, 79).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F))
		.texOffs(88, 75).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftPlate10.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(24, 101).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftPlate10.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(19, 101).addBox(-0.4995F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1026F, -3.5404F, 2.3739F, -0.6437F, 0.0147F, -0.0112F));

		PartDefinition cube_r106 = leftPlate10.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(94, 20).addBox(-0.5F, -2.0565F, -0.4142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate10 = body.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9534F, -4.573F, 4.9109F, -0.4173F, -0.1095F, -0.2063F));

		PartDefinition cube_r107 = rightPlate10.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 89).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightPlate10.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightPlate10.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightPlate10.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 33).mirror().addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.9056F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightPlate10.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightPlate10.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(110, 13).mirror().addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false)
		.texOffs(110, 3).mirror().addBox(-1.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 1.0416F, 0.6381F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightPlate10.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(88, 79).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F)).mirror(false)
		.texOffs(88, 75).mirror().addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightPlate10.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(24, 101).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightPlate10.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(19, 101).mirror().addBox(-0.5005F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -3.5404F, 2.3739F, -0.6437F, -0.0147F, 0.0112F));

		PartDefinition cube_r116 = rightPlate10.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(94, 20).mirror().addBox(-0.5F, -2.0565F, -0.4142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1422F, 4.0499F, 0.0301F, -0.5245F, 0.0286F));

		PartDefinition cube_r117 = tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(95, 75).addBox(0.0F, -3.3769F, -0.1297F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0558F, 6.8411F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(30, 95).addBox(0.0F, -3.6236F, -0.0959F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 4.8411F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(27, 95).addBox(0.0F, -3.1696F, -0.0742F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7558F, 2.8411F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 104).addBox(0.0F, -3.027F, 0.0345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9558F, 0.7411F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(21, 27).addBox(-0.5F, -1.0422F, 0.9173F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0558F, -0.2589F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = tail.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7984F, -3.9914F, 10.2916F, -0.4184F, 0.1638F, 0.3266F));

		PartDefinition cube_r122 = leftPlate11.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(72, 93).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftPlate11.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftPlate11.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(80, 88).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftPlate11.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 101).addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.9057F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftPlate11.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(48, 101).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftPlate11.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(28, 110).addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F))
		.texOffs(0, 110).addBox(0.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-0.3739F, 1.0416F, 0.6381F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftPlate11.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(89, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F))
		.texOffs(55, 88).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftPlate11.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(101, 46).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftPlate11.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(101, 42).addBox(-0.4995F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1026F, -3.5404F, 2.3739F, -0.6437F, 0.0147F, -0.0112F));

		PartDefinition cube_r131 = leftPlate11.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(90, 94).addBox(-0.5F, -2.0565F, -0.4142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate11 = tail.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7984F, -3.9914F, 10.2916F, -0.4184F, -0.1638F, -0.3266F));

		PartDefinition cube_r132 = rightPlate11.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(72, 93).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightPlate11.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightPlate11.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(80, 88).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightPlate11.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(53, 101).mirror().addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.9057F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightPlate11.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 101).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightPlate11.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(28, 110).mirror().addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false)
		.texOffs(0, 110).mirror().addBox(-1.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 1.0416F, 0.6381F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightPlate11.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(89, 25).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F)).mirror(false)
		.texOffs(55, 88).mirror().addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightPlate11.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(101, 46).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightPlate11.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(101, 42).mirror().addBox(-0.5005F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -3.5404F, 2.3739F, -0.6437F, -0.0147F, 0.0112F));

		PartDefinition cube_r141 = rightPlate11.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(90, 94).mirror().addBox(-0.5F, -2.0565F, -0.4142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8269F, 8.6643F, -0.2519F, -0.467F, 0.1153F));

		PartDefinition cube_r142 = tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(112, 56).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6797F, 0.2306F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(54, 112).addBox(0.0F, 1.1106F, 1.4797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 112).addBox(0.0F, 1.1106F, 7.4797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 112).addBox(0.0F, 1.1106F, 5.4797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(112, 48).addBox(0.0F, 1.1106F, 3.4797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 0).addBox(-0.5F, -0.8894F, -0.5203F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0707F, 0.3071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(21, 105).addBox(0.0F, -2.2681F, -0.9925F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5702F, 8.7913F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(33, 110).addBox(0.0F, -2.4119F, -1.0074F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5702F, 6.7913F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(18, 105).addBox(0.0F, -2.5782F, -0.0176F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6702F, 3.7913F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(13, 96).addBox(0.0F, -2.9227F, -0.0203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7702F, 1.7913F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(95, 94).addBox(0.0F, -3.0068F, -0.13F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8702F, -0.1087F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail2.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6428F, -4.5496F, 10.6547F, -0.4533F, 0.1679F, 0.3246F));

		PartDefinition cube_r149 = leftPlate12.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(85, 93).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftPlate12.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 83).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftPlate12.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(88, 83).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftPlate12.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(102, 50).addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.9057F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftPlate12.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(102, 37).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftPlate12.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(110, 84).addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F))
		.texOffs(109, 20).addBox(0.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-0.3739F, 1.0416F, 0.6382F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftPlate12.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F))
		.texOffs(7, 86).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftPlate12.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(10, 102).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftPlate12.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(63, 101).addBox(-0.4995F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1026F, -3.5404F, 2.3739F, -0.6437F, 0.0147F, -0.0112F));

		PartDefinition cube_r158 = leftPlate12.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(95, 5).addBox(-0.5F, -2.0565F, -0.4142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate12 = tail2.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6428F, -4.5496F, 10.6547F, -0.4533F, -0.1679F, -0.3246F));

		PartDefinition cube_r159 = rightPlate12.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(85, 93).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightPlate12.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightPlate12.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightPlate12.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(102, 50).mirror().addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.9057F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r163 = rightPlate12.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(102, 37).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r164 = rightPlate12.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(110, 84).mirror().addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false)
		.texOffs(109, 20).mirror().addBox(-1.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 1.0416F, 0.6382F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightPlate12.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F)).mirror(false)
		.texOffs(7, 86).mirror().addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightPlate12.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r167 = rightPlate12.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(63, 101).mirror().addBox(-0.5005F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -3.5404F, 2.3739F, -0.6437F, -0.0147F, 0.0112F));

		PartDefinition cube_r168 = rightPlate12.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(95, 5).mirror().addBox(-0.5F, -2.0565F, -0.4142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5165F, 10.7012F, -0.1946F, -0.386F, 0.0741F));

		PartDefinition cube_r169 = tail3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(36, 112).addBox(0.0F, -0.7569F, 7.9331F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2355F, -0.0105F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(85, 112).addBox(0.0F, 0.1431F, 5.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 112).addBox(0.0F, 0.1431F, 3.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 112).addBox(0.0F, 0.0431F, 1.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2355F, -0.8105F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(103, 112).addBox(0.0F, -0.0569F, -0.0669F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2355F, -0.8105F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(112, 59).addBox(0.0F, 0.186F, 5.1169F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 111).addBox(0.0F, -0.514F, 3.1169F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 111).addBox(0.0F, -1.114F, 1.1169F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 111).addBox(0.0F, -1.914F, -0.8831F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8055F, 1.8736F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(24, 105).addBox(0.0F, -2.0562F, -0.9224F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6055F, -0.1264F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9455F, -0.8252F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1358F, -0.1669F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7978F, 9.8997F, 0.1982F, -0.3858F, -0.0754F));

		PartDefinition cube_r175 = tail4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(100, 112).addBox(0.0F, 0.3431F, 17.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(97, 112).addBox(0.0F, 0.5431F, 15.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 112).addBox(0.0F, 0.7431F, 13.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 112).addBox(0.0F, 0.5431F, 11.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 112).addBox(0.0F, 0.2431F, 9.9331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0371F, -9.8231F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.5055F, 0.139F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = tail4.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1778F, -1.6231F, 1.8227F, -0.3425F, 0.2239F, 0.4453F));

		PartDefinition cube_r177 = leftPlate13.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(53, 92).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftPlate13.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(48, 92).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftPlate13.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(62, 88).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftPlate13.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 99).addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.9056F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftPlate13.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(74, 99).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftPlate13.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(110, 66).addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F))
		.texOffs(108, 72).addBox(0.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-0.3739F, 1.0416F, 0.6381F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftPlate13.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(89, 34).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F))
		.texOffs(85, 55).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftPlate13.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(58, 99).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftPlate13.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(99, 29).addBox(-0.4995F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1026F, -3.5404F, 2.3739F, -0.6437F, 0.0147F, -0.0112F));

		PartDefinition cube_r186 = leftPlate13.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(14, 90).addBox(-0.5F, -3.0565F, -0.4142F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate13 = tail4.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1778F, -1.6231F, 1.8227F, -0.3425F, -0.2239F, -0.4453F));

		PartDefinition cube_r187 = rightPlate13.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(53, 92).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightPlate13.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightPlate13.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(62, 88).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightPlate13.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(90, 99).mirror().addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.9056F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightPlate13.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(74, 99).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightPlate13.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(110, 66).mirror().addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false)
		.texOffs(108, 72).mirror().addBox(-1.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 1.0416F, 0.6381F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightPlate13.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F)).mirror(false)
		.texOffs(85, 55).mirror().addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightPlate13.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(58, 99).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightPlate13.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(99, 29).mirror().addBox(-0.5005F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -3.5404F, 2.3739F, -0.6437F, -0.0147F, 0.0112F));

		PartDefinition cube_r196 = rightPlate13.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(14, 90).mirror().addBox(-0.5F, -3.0565F, -0.4142F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(32, 38).addBox(-0.5F, -0.3784F, -0.1333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0449F, 9.0714F, 0.2391F, -0.5974F, -0.1363F));

		PartDefinition leftPlate14 = tail5.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4778F, -0.9075F, 2.7994F, -0.6202F, 0.3061F, 0.5509F));

		PartDefinition cube_r197 = leftPlate14.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(22, 92).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftPlate14.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(91, 49).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftPlate14.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(61, 73).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftPlate14.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(85, 98).addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.9057F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftPlate14.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(98, 83).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftPlate14.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(110, 63).addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F))
		.texOffs(108, 97).addBox(0.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-0.3739F, 1.0416F, 0.6382F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftPlate14.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(85, 89).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F))
		.texOffs(14, 86).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftPlate14.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 79).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftPlate14.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(98, 75).addBox(-0.4995F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1026F, -3.5404F, 2.3739F, -0.6437F, 0.0147F, -0.0112F));

		PartDefinition cube_r206 = leftPlate14.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(62, 57).addBox(-0.5F, -8.0565F, -0.4142F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate14 = tail5.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4778F, -0.9075F, 2.7994F, -0.6202F, -0.3061F, -0.5509F));

		PartDefinition cube_r207 = rightPlate14.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(22, 92).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2493F, 2.1586F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightPlate14.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightPlate14.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(61, 73).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightPlate14.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-0.5F, -0.2176F, -0.6471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.9057F, 2.2046F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightPlate14.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(98, 83).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1536F, 1.1547F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightPlate14.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(110, 63).mirror().addBox(-0.5F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false)
		.texOffs(108, 97).mirror().addBox(-1.1F, -0.8274F, -0.1954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 1.0416F, 0.6382F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightPlate14.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(85, 89).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.175F)).mirror(false)
		.texOffs(14, 86).mirror().addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.3739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightPlate14.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightPlate14.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(-0.5005F, -0.1542F, -0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -3.5404F, 2.3739F, -0.6437F, -0.0147F, 0.0112F));

		PartDefinition cube_r216 = rightPlate14.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.5F, -8.0565F, -0.4142F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.9698F, 2.9314F, -0.6458F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -4.55F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(17, 38).addBox(-1.0F, -1.8893F, 4.3354F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.0075F, -10.5364F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(15, 107).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.4494F, -2.2448F, -0.0571F, 0.2105F, 0.1505F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(63, 94).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.4494F, -2.2448F, 0.0386F, 0.2146F, 0.5971F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 112).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.4494F, -2.2448F, 0.1984F, 0.0049F, 1.9468F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(97, 55).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3494F, -4.2448F, -0.0043F, 0.2024F, 0.1614F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3494F, -4.2448F, 0.0826F, 0.185F, 0.6058F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(11, 112).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3494F, -4.2448F, 0.1791F, -0.0438F, 1.9472F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(74, 85).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1494F, -6.1448F, 0.0484F, 0.1937F, 0.1717F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(25, 63).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1494F, -6.1448F, 0.1262F, 0.155F, 0.6132F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(8, 112).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1494F, -6.1448F, 0.1598F, -0.0925F, 1.9485F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.2506F, -8.0448F, 0.1206F, -0.1897F, 1.954F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(16, 96).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.2506F, -8.0448F, 0.2122F, 0.0943F, 0.6239F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.2506F, -8.0448F, 0.1532F, 0.1748F, 0.1909F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(11, 53).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8506F, -10.0448F, 0.2572F, 0.154F, 0.208F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 98).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8506F, -10.0448F, 0.2972F, 0.0328F, 0.6293F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(111, 109).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8506F, -10.0448F, 0.0798F, -0.2867F, 1.9636F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 112).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.4494F, -2.2448F, 0.1984F, -0.0049F, -1.9468F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(63, 94).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.4494F, -2.2448F, 0.0386F, -0.2146F, -0.5971F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(15, 107).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.4494F, -2.2448F, -0.0571F, -0.2105F, -0.1505F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(11, 112).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3494F, -4.2448F, 0.1791F, 0.0438F, -1.9472F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(10, 94).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3494F, -4.2448F, 0.0826F, -0.185F, -0.6058F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(97, 55).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3494F, -4.2448F, -0.0043F, -0.2024F, -0.1614F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(8, 112).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1494F, -6.1448F, 0.1598F, 0.0925F, -1.9485F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(25, 63).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1494F, -6.1448F, 0.1262F, -0.155F, -0.6132F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(74, 85).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1494F, -6.1448F, 0.0484F, -0.1937F, -0.1717F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(31, 80).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.2506F, -8.0448F, 0.1532F, -0.1748F, -0.1909F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(16, 96).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.2506F, -8.0448F, 0.2122F, -0.0943F, -0.6239F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(5, 112).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.2506F, -8.0448F, 0.1206F, 0.1897F, -1.954F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(111, 109).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8506F, -10.0448F, 0.0798F, 0.2867F, -1.9636F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(71, 98).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8506F, -10.0448F, 0.2972F, -0.0328F, -0.6293F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(11, 53).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8506F, -10.0448F, 0.2572F, -0.154F, -0.208F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(32, 46).addBox(-1.0F, -1.1006F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0075F, -10.5364F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r249 = body2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(95, 10).addBox(-0.5F, -3.8227F, -0.1129F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -2.25F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(15, 102).addBox(-0.5F, -3.3227F, -0.1129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -4.25F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r251 = body2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(43, 104).addBox(-0.5F, -3.1227F, -0.1129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.25F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r252 = body2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(82, 94).addBox(-0.5F, -3.3227F, -0.1129F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -8.15F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r253 = body2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(40, 104).addBox(-0.5F, -2.9227F, -0.1129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -10.15F, 0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate7 = body2.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7021F, -2.817F, -9.3687F, 0.3826F, 0.0762F, 0.2206F));

		PartDefinition cube_r254 = leftPlate7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(101, 109).addBox(-0.5F, -0.8857F, -0.9539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F))
		.texOffs(92, 38).addBox(-0.5F, -1.7857F, -1.5539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -1.2057F, 2.2046F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftPlate7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(106, 109).addBox(-0.5F, -2.2902F, -0.669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
		.texOffs(99, 20).addBox(-0.5F, -1.7902F, -0.669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.0943F, 0.5046F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftPlate7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, -0.3996F, 1.0457F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftPlate7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 99).addBox(-0.5F, -1.8603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftPlate7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(84, 102).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0801F, -2.8577F, 2.1741F, -0.2281F, -0.0066F, 0.0077F));

		PartDefinition cube_r259 = leftPlate7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(100, 4).addBox(-0.5F, -1.8554F, -0.1965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.3698F, 1.3314F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftPlate7.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, -1.8365F, -0.205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -2.0698F, 0.4314F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightPlate7 = body2.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7021F, -2.817F, -9.3687F, 0.3826F, -0.0762F, -0.2206F));

		PartDefinition cube_r261 = rightPlate7.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(101, 109).mirror().addBox(-0.5F, -0.8857F, -0.9539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false)
		.texOffs(92, 38).mirror().addBox(-0.5F, -1.7857F, -1.5539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2057F, 2.2046F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r262 = rightPlate7.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(106, 109).mirror().addBox(-0.5F, -2.2902F, -0.669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
		.texOffs(99, 20).mirror().addBox(-0.5F, -1.7902F, -0.669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0943F, 0.5046F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightPlate7.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.3996F, 1.0457F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightPlate7.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.5F, -1.8603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r265 = rightPlate7.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(84, 102).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0801F, -2.8577F, 2.1741F, -0.2281F, 0.0066F, -0.0077F));

		PartDefinition cube_r266 = rightPlate7.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(100, 4).mirror().addBox(-0.5F, -1.8554F, -0.1965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.3698F, 1.3314F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r267 = rightPlate7.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.5F, -1.8365F, -0.205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.0698F, 0.4314F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = body2.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8042F, -4.5546F, -4.539F, 0.2285F, 0.1095F, 0.2063F));

		PartDefinition cube_r268 = leftPlate8.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(67, 88).addBox(-0.5F, -0.8857F, -1.9539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -1.2057F, 2.2046F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftPlate8.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(34, 80).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -1.2612F, 1.1062F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftPlate8.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(102, 59).addBox(-0.5F, -0.2403F, -0.7576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.3057F, 2.0046F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftPlate8.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(33, 100).addBox(-0.5F, -0.4028F, -0.8605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, -0.4057F, 1.4046F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftPlate8.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 40).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftPlate8.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(98, 0).addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftPlate8.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(97, 71).addBox(-0.5F, -1.8603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftPlate8.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(5, 94).addBox(-0.5068F, -2.6567F, -0.7783F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0801F, -2.0577F, 2.2741F, -0.347F, 0.0147F, -0.0112F));

		PartDefinition cube_r276 = leftPlate8.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(92, 54).addBox(-0.5F, -2.8554F, -0.1965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.3698F, 1.3314F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftPlate8.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(100, 14).addBox(-0.5F, -1.8365F, -0.205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -2.0698F, 0.4314F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = body2.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8042F, -4.5546F, -4.539F, 0.2285F, -0.1095F, -0.2063F));

		PartDefinition cube_r278 = rightPlate8.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 88).mirror().addBox(-0.5F, -0.8857F, -1.9539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2057F, 2.2046F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightPlate8.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(34, 80).mirror().addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2612F, 1.1062F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightPlate8.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(102, 59).mirror().addBox(-0.5F, -0.2403F, -0.7576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.3057F, 2.0046F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightPlate8.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(33, 100).mirror().addBox(-0.5F, -0.4028F, -0.8605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4057F, 1.4046F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightPlate8.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightPlate8.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-0.5F, -0.9603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightPlate8.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(97, 71).mirror().addBox(-0.5F, -1.8603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightPlate8.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.4932F, -2.6567F, -0.7783F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0801F, -2.0577F, 2.2741F, -0.347F, -0.0147F, 0.0112F));

		PartDefinition cube_r286 = rightPlate8.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(92, 54).mirror().addBox(-0.5F, -2.8554F, -0.1965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.3698F, 1.3314F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightPlate8.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(100, 14).mirror().addBox(-0.5F, -1.8365F, -0.205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.0698F, 0.4314F, -0.6109F, 0.0F, 0.0F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.596F, -10.1452F, 0.2271F, 0.0425F, 0.0098F));

		PartDefinition cube_r288 = upperbody.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(51, 111).addBox(-0.5F, -2.0053F, -1.5796F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(111, 44).addBox(-0.5F, -2.2053F, 0.4204F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(111, 40).addBox(-0.5F, -2.5053F, 2.4204F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 14).addBox(-1.0F, -0.7053F, -2.3796F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 2.204F, -7.7048F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r289 = upperbody.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(45, 111).addBox(-0.5F, -2.1863F, -0.2519F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.304F, -3.4048F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r290 = upperbody.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(37, 104).addBox(-0.5F, -2.5574F, -0.2913F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.196F, -1.4048F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r291 = upperbody.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(70, 112).mirror().addBox(-0.0218F, 0.8278F, -0.1801F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 2.3546F, -9.3997F, -0.0097F, -0.4593F, 1.804F));

		PartDefinition cube_r292 = upperbody.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(68, 101).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 2.3546F, -9.3997F, 0.4475F, -0.0862F, 0.4329F));

		PartDefinition cube_r293 = upperbody.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(67, 111).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 2.3546F, -9.3997F, 0.4439F, 0.1044F, 0.0398F));

		PartDefinition cube_r294 = upperbody.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(110, 87).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3454F, -1.3997F, 0.1185F, -0.1511F, 1.94F));

		PartDefinition cube_r295 = upperbody.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3454F, -1.3997F, 0.174F, 0.1014F, 0.6058F));

		PartDefinition cube_r296 = upperbody.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(28, 79).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3454F, -1.3997F, 0.1151F, 0.1653F, 0.1702F));

		PartDefinition cube_r297 = upperbody.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(54, 69).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.1546F, -3.4997F, 0.0729F, -0.2648F, 1.9494F));

		PartDefinition cube_r298 = upperbody.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(97, 65).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.1546F, -3.4997F, 0.2744F, 0.0314F, 0.6125F));

		PartDefinition cube_r299 = upperbody.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.1546F, -3.4997F, 0.2368F, 0.1434F, 0.1889F));

		PartDefinition cube_r300 = upperbody.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(111, 23).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7546F, -5.3997F, 0.0387F, -0.3458F, 1.9597F));

		PartDefinition cube_r301 = upperbody.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(95, 100).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7546F, -5.3997F, 0.3458F, -0.0188F, 0.6129F));

		PartDefinition cube_r302 = upperbody.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(19, 92).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7546F, -5.3997F, 0.3232F, 0.1265F, 0.2005F));

		PartDefinition cube_r303 = upperbody.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(97, 88).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.4546F, -7.4997F, 0.4264F, 0.1051F, 0.0379F));

		PartDefinition cube_r304 = upperbody.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(29, 101).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.4546F, -7.4997F, 0.4317F, -0.0789F, 0.4342F));

		PartDefinition cube_r305 = upperbody.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(111, 30).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.4546F, -7.4997F, -0.0052F, -0.4424F, 1.8021F));

		PartDefinition cube_r306 = upperbody.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.2835F, -3.9138F, -0.2145F, -0.6698F, 0.4181F));

		PartDefinition cube_r307 = upperbody.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.2835F, -3.9138F, -0.1249F, -0.8607F, 0.4403F));

		PartDefinition cube_r308 = upperbody.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.2835F, -3.9138F, -0.1209F, -1.1485F, 0.5788F));

		PartDefinition cube_r309 = upperbody.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(16, 73).mirror().addBox(-0.7F, 0.0233F, -0.0805F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.2835F, -3.9138F, -1.6214F, -1.4378F, 2.1776F));

		PartDefinition cube_r310 = upperbody.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(0.0F, -1.0569F, 0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
		.texOffs(84, 51).addBox(3.0F, -1.0569F, 0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 9.504F, -6.0048F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r311 = upperbody.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(0.0F, -0.9268F, -0.0555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(45, 69).addBox(3.0F, -0.9268F, -0.0555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 8.204F, -8.6048F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r312 = upperbody.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(45, 46).mirror().addBox(-0.5F, -1.5F, -2.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6829F, 6.1491F, -7.7416F, 1.268F, -0.3734F, -0.3951F));

		PartDefinition cube_r313 = upperbody.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(49, 62).mirror().addBox(-0.5F, -1.9F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.4561F, 5.1771F, -6.875F, 0.1161F, -0.3734F, -0.3951F));

		PartDefinition cube_r314 = upperbody.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-3.0F, -0.1256F, -3.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
		.texOffs(67, 45).addBox(5.0F, -0.1256F, -3.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.804F, -5.4048F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r315 = upperbody.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(58, 68).mirror().addBox(-3.0F, -1.0199F, -0.0688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
		.texOffs(58, 68).addBox(5.0F, -1.0199F, -0.0688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, 5.104F, -5.7048F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r316 = upperbody.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-3.0F, -0.0549F, -2.0769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(74, 76).addBox(5.0F, -0.0549F, -2.0769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.304F, -4.0048F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r317 = upperbody.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-3.0F, -1.0F, 6.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
		.texOffs(79, 3).addBox(5.0F, -1.0F, 6.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, 3.404F, -10.1048F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r318 = upperbody.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(49, 62).addBox(-0.5F, -1.9F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.4561F, 5.1771F, -6.875F, 0.1161F, 0.3734F, 0.3951F));

		PartDefinition cube_r319 = upperbody.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(45, 46).addBox(-0.5F, -1.5F, -2.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6829F, 6.1491F, -7.7416F, 1.268F, 0.3734F, 0.3951F));

		PartDefinition cube_r320 = upperbody.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(16, 73).addBox(-0.3F, 0.0233F, -0.0805F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.2835F, -3.9138F, -1.6214F, 1.4378F, -2.1776F));

		PartDefinition cube_r321 = upperbody.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(47, 37).addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.2835F, -3.9138F, -0.1209F, 1.1485F, -0.5788F));

		PartDefinition cube_r322 = upperbody.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.2835F, -3.9138F, -0.1249F, 0.8607F, -0.4403F));

		PartDefinition cube_r323 = upperbody.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.2835F, -3.9138F, -0.2145F, 0.6698F, -0.4181F));

		PartDefinition cube_r324 = upperbody.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(28, 79).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3454F, -1.3997F, 0.1151F, -0.1653F, -0.1702F));

		PartDefinition cube_r325 = upperbody.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(58, 62).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3454F, -1.3997F, 0.174F, -0.1014F, -0.6058F));

		PartDefinition cube_r326 = upperbody.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(110, 87).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3454F, -1.3997F, 0.1185F, 0.1511F, -1.94F));

		PartDefinition cube_r327 = upperbody.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(77, 85).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.1546F, -3.4997F, 0.2368F, -0.1434F, -0.1889F));

		PartDefinition cube_r328 = upperbody.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(97, 65).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.1546F, -3.4997F, 0.2744F, -0.0314F, -0.6125F));

		PartDefinition cube_r329 = upperbody.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(54, 69).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.1546F, -3.4997F, 0.0729F, 0.2648F, -1.9494F));

		PartDefinition cube_r330 = upperbody.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(19, 92).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7546F, -5.3997F, 0.3232F, -0.1265F, -0.2005F));

		PartDefinition cube_r331 = upperbody.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(95, 100).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7546F, -5.3997F, 0.3458F, 0.0188F, -0.6129F));

		PartDefinition cube_r332 = upperbody.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(111, 23).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7546F, -5.3997F, 0.0387F, 0.3458F, -1.9597F));

		PartDefinition cube_r333 = upperbody.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(67, 111).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3936F, 2.3546F, -9.3997F, 0.4439F, -0.1044F, -0.0398F));

		PartDefinition cube_r334 = upperbody.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(68, 101).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3936F, 2.3546F, -9.3997F, 0.4475F, 0.0862F, -0.4329F));

		PartDefinition cube_r335 = upperbody.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 112).addBox(0.0218F, 0.8278F, -0.1801F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3936F, 2.3546F, -9.3997F, -0.0097F, 0.4593F, -1.804F));

		PartDefinition cube_r336 = upperbody.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(111, 30).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.4546F, -7.4997F, -0.0052F, 0.4424F, -1.8021F));

		PartDefinition cube_r337 = upperbody.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(29, 101).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.4546F, -7.4997F, 0.4317F, 0.0789F, -0.4342F));

		PartDefinition cube_r338 = upperbody.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(97, 88).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.4546F, -7.4997F, 0.4264F, -0.1051F, -0.0379F));

		PartDefinition leftPlate5 = upperbody.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.967F, -1.4582F, -6.9779F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition cube_r339 = leftPlate5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(53, 79).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -1.9092F, 0.1207F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r340 = leftPlate5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(21, 79).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.6406F, -0.1633F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r341 = leftPlate5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(68, 50).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r342 = leftPlate5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 21).addBox(-0.5F, -0.1866F, -0.2349F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -2.7992F, -0.5491F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r343 = leftPlate5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(76, 109).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.146F, -2.6623F, 1.2809F, 0.0162F, -0.0066F, 0.0077F));

		PartDefinition cube_r344 = leftPlate5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(53, 97).addBox(-0.5F, -0.1833F, -0.7918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1544F, -3.4738F, 0.9594F, 0.0162F, -0.0066F, 0.0077F));

		PartDefinition cube_r345 = leftPlate5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(83, 8).addBox(-0.4994F, 0.3498F, -0.3845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1544F, -3.4738F, 0.9594F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r346 = leftPlate5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(104, 18).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -2.8694F, -0.3634F, -0.733F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = upperbody.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.967F, -1.4582F, -6.9779F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition cube_r347 = rightPlate5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(53, 79).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.9092F, 0.1207F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightPlate5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6406F, -0.1633F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightPlate5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(68, 50).mirror().addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightPlate5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(73, 21).mirror().addBox(-0.5F, -0.1866F, -0.2349F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.7992F, -0.5491F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightPlate5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(76, 109).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.146F, -2.6623F, 1.2809F, 0.0162F, 0.0066F, -0.0077F));

		PartDefinition cube_r352 = rightPlate5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(-0.5F, -0.1833F, -0.7918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1544F, -3.4738F, 0.9594F, 0.0162F, 0.0066F, -0.0077F));

		PartDefinition cube_r353 = rightPlate5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-0.5006F, 0.3498F, -0.3845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1544F, -3.4738F, 0.9594F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightPlate5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.8694F, -0.3634F, -0.733F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = upperbody.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1857F, -3.4745F, -1.7148F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition cube_r355 = leftPlate6.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(86, 109).addBox(-0.5F, -1.0857F, -0.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F))
		.texOffs(91, 109).addBox(-0.5F, -1.0857F, -1.2539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F))
		.texOffs(81, 109).addBox(-0.5F, -0.7857F, -0.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -1.1053F, 1.0098F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r356 = leftPlate6.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(98, 10).addBox(-0.5F, 0.08F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.1549F, -1.8053F, 0.6098F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r357 = leftPlate6.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(88, 16).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r358 = leftPlate6.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, 0.6134F, -0.2349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -2.7992F, -0.5491F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r359 = leftPlate6.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(23, 110).addBox(-0.4997F, -0.2049F, -0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1435F, -2.4591F, 1.389F, -0.1234F, -0.0066F, 0.0077F));

		PartDefinition cube_r360 = leftPlate6.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(18, 110).addBox(-0.5F, 0.2167F, -0.3918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1544F, -3.4738F, 0.9594F, 0.0162F, -0.0066F, 0.0077F));

		PartDefinition cube_r361 = leftPlate6.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(21, 88).addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -2.8694F, -0.3634F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r362 = leftPlate6.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(100, 87).addBox(-0.5F, -1.7716F, -0.2346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -2.3694F, -0.3634F, -1.3614F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = upperbody.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1857F, -3.4745F, -1.7148F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition cube_r363 = rightPlate6.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(86, 109).mirror().addBox(-0.5F, -1.0857F, -0.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false)
		.texOffs(91, 109).mirror().addBox(-0.5F, -1.0857F, -1.2539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false)
		.texOffs(81, 109).mirror().addBox(-0.5F, -0.7857F, -0.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.1053F, 1.0098F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightPlate6.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(98, 10).mirror().addBox(-0.5F, 0.08F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8053F, 0.6098F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightPlate6.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(88, 16).mirror().addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightPlate6.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, 0.6134F, -0.2349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.7992F, -0.5491F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightPlate6.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(23, 110).mirror().addBox(-0.5003F, -0.2049F, -0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1435F, -2.4591F, 1.389F, -0.1234F, 0.0066F, -0.0077F));

		PartDefinition cube_r368 = rightPlate6.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(18, 110).mirror().addBox(-0.5F, 0.2167F, -0.3918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1544F, -3.4738F, 0.9594F, 0.0162F, 0.0066F, -0.0077F));

		PartDefinition cube_r369 = rightPlate6.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(21, 88).mirror().addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.8694F, -0.3634F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightPlate6.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(100, 87).mirror().addBox(-0.5F, -1.7716F, -0.2346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.3694F, -0.3634F, -1.3614F, 0.0F, 0.0F));

		PartDefinition spike = upperbody.addOrReplaceChild("spike", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7794F, 5.5429F, -6.2399F, 0.1383F, 0.364F, 0.1283F));

		PartDefinition cube_r371 = spike.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(72, 0).addBox(-0.257F, -0.2885F, -0.127F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0134F, -2.4069F, 7.4458F, 2.5784F, -1.1946F, -2.704F));

		PartDefinition cube_r372 = spike.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(72, 10).addBox(-0.4009F, -1.0468F, 0.4986F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.0134F, -0.9069F, 3.8458F, 0.7257F, -1.2707F, -0.7965F));

		PartDefinition cube_r373 = spike.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(58, 46).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2936F, -0.3187F, -0.3268F, 0.2001F, -0.162F, -0.1261F));

		PartDefinition cube_r374 = spike.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(29, 54).addBox(-4.9812F, -0.9608F, 0.0086F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4315F, -0.9F, 3.6444F, 0.0374F, -1.1341F, -0.0413F));

		PartDefinition cube_r375 = spike.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(53, 32).addBox(-4.9812F, -0.9608F, 0.0086F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4315F, -0.9F, 3.6444F, 0.7075F, -0.9812F, -0.7996F));

		PartDefinition cube_r376 = spike.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(5, 69).addBox(-3.7866F, -0.6103F, -0.0881F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2315F, -1.2F, 3.4444F, 0.3076F, -0.866F, -0.3308F));

		PartDefinition cube_r377 = spike.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(46, 23).addBox(-5.7866F, -0.6103F, -0.0881F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2315F, -1.2F, 3.4444F, 0.4991F, -1.1485F, -0.5548F));

		PartDefinition spike2 = upperbody.addOrReplaceChild("spike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7794F, 5.5429F, -6.2399F, 0.1383F, -0.364F, -0.1283F));

		PartDefinition cube_r378 = spike2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(5, 72).addBox(-3.743F, -0.2885F, -0.127F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0134F, -2.4069F, 7.4458F, 2.4711F, 1.1678F, 2.5855F));

		PartDefinition cube_r379 = spike2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(72, 13).addBox(-3.5991F, -1.0468F, 0.4986F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.0134F, -0.9069F, 3.8458F, 0.7257F, 1.2707F, 0.7965F));

		PartDefinition cube_r380 = spike2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(29, 62).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2936F, -0.3187F, -0.3268F, 0.2001F, 0.162F, 0.1261F));

		PartDefinition cube_r381 = spike2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(55, 54).addBox(-0.0188F, -0.9608F, 0.0086F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4315F, -0.9F, 3.6444F, 0.0374F, 1.1341F, 0.0413F));

		PartDefinition cube_r382 = spike2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(42, 54).addBox(-0.0188F, -0.9608F, 0.0086F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4315F, -0.9F, 3.6444F, 0.7075F, 0.9812F, 0.7996F));

		PartDefinition cube_r383 = spike2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(25, 69).addBox(-0.2134F, -0.6103F, -0.0881F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2315F, -1.2F, 3.4444F, 0.3076F, 0.866F, 0.3308F));

		PartDefinition cube_r384 = spike2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(47, 43).addBox(-0.2134F, -0.6103F, -0.0881F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2315F, -1.2F, 3.4444F, 0.4991F, 1.1485F, 0.5548F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1005F, -9.6886F, -0.3547F, 0.5558F, -0.1195F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(73, 112).addBox(0.5F, -1.0318F, -0.1564F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(112, 69).addBox(0.5F, -1.1318F, 1.8436F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 6).addBox(0.0F, -0.5318F, -0.1564F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2672F, -3.7014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1482F, 0.7604F, -0.652F, 0.8648F, -0.2371F, 0.3971F));

		PartDefinition cube_r387 = neck.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(0.0F, 0.0132F, -0.5107F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2993F, -4.2359F, 0.9654F, -0.0301F, 0.2161F));

		PartDefinition cube_r388 = neck.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(5, 107).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1482F, 0.7604F, -0.652F, 0.8648F, 0.2371F, -0.3971F));

		PartDefinition cube_r389 = neck.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(16, 69).addBox(0.0F, 0.0132F, -0.5107F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2993F, -4.2359F, 0.9654F, 0.0301F, -0.2161F));

		PartDefinition cube_r390 = neck.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(39, 112).addBox(0.5F, -0.75F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
		.texOffs(74, 81).addBox(0.0F, -0.35F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 0.3672F, -5.7014F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftPlate4 = neck.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8397F, -2.7679F, -1.6657F, 0.5921F, 0.0762F, 0.2206F));

		PartDefinition cube_r391 = leftPlate4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(48, 97).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F))
		.texOffs(97, 38).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.6406F, -0.1633F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r392 = leftPlate4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(97, 51).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -1.9092F, 0.1207F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r393 = leftPlate4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(91, 44).addBox(-0.5F, -2.3F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F))
		.texOffs(81, 84).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F))
		.texOffs(43, 91).addBox(-0.5F, -2.2F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r394 = leftPlate4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(66, 108).addBox(-0.4988F, -0.584F, -0.1214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1544F, -2.4738F, -0.0406F, 0.1559F, -0.0076F, 0.0067F));

		PartDefinition cube_r395 = leftPlate4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(61, 108).addBox(-0.4994F, -0.4147F, -0.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
		.texOffs(51, 108).addBox(-0.4994F, -0.1147F, -0.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1544F, -2.4738F, -0.0406F, -1.0821F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = neck.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8397F, -2.7679F, -1.6657F, 0.5921F, -0.0762F, -0.2206F));

		PartDefinition cube_r396 = rightPlate4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(48, 97).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
		.texOffs(97, 38).mirror().addBox(-0.5F, -1.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6406F, -0.1633F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r397 = rightPlate4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.9092F, 0.1207F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r398 = rightPlate4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(91, 44).mirror().addBox(-0.5F, -2.3F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(81, 84).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false)
		.texOffs(43, 91).mirror().addBox(-0.5F, -2.2F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r399 = rightPlate4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(66, 108).mirror().addBox(-0.5012F, -0.584F, -0.1214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1544F, -2.4738F, -0.0406F, 0.1559F, 0.0076F, -0.0067F));

		PartDefinition cube_r400 = rightPlate4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(61, 108).mirror().addBox(-0.5006F, -0.4147F, -0.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
		.texOffs(51, 108).mirror().addBox(-0.5006F, -0.1147F, -0.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1544F, -2.4738F, -0.0406F, -1.0821F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4672F, -5.5514F, -0.4477F, 0.1279F, -0.119F));

		PartDefinition cube_r401 = neck2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(83, 0).addBox(0.5F, -0.967F, 0.958F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(83, 12).addBox(0.0F, -0.467F, 0.958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1976F, -2.9519F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(82, 40).addBox(0.5F, -1.05F, -0.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
		.texOffs(61, 23).addBox(0.5F, -1.05F, 1.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
		.texOffs(0, 53).addBox(0.0F, -0.65F, -0.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.1976F, -5.0519F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate2 = neck2.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5567F, -0.9855F, -3.7923F, -0.0537F, 0.0762F, 0.2206F));

		PartDefinition cube_r403 = leftPlate2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(96, 43).addBox(-0.5F, -1.8929F, -1.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r404 = leftPlate2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(43, 96).addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F))
		.texOffs(38, 96).addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r405 = leftPlate2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.4562F, -0.221F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftPlate2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(107, 106).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.5734F, -0.6126F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = neck2.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5567F, -0.9855F, -3.7923F, -0.0537F, -0.0762F, -0.2206F));

		PartDefinition cube_r407 = rightPlate2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(96, 43).mirror().addBox(-0.5F, -1.8929F, -1.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightPlate2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(38, 96).mirror().addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightPlate2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.4562F, -0.221F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r410 = rightPlate2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(107, 106).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5734F, -0.6126F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck2.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6004F, -1.4054F, -0.4968F, 0.1732F, 0.0762F, 0.2206F));

		PartDefinition cube_r411 = leftPlate3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(22, 97).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F))
		.texOffs(96, 47).addBox(-0.5F, -1.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.6406F, -0.1633F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r412 = leftPlate3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(98, 98).addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F))
		.texOffs(41, 87).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F))
		.texOffs(98, 94).addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r413 = leftPlate3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(108, 10).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.6898F, -0.162F, 0.4002F, -0.0089F, 0.0046F));

		PartDefinition cube_r414 = leftPlate3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(46, 108).addBox(-0.5F, -0.5728F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
		.texOffs(108, 7).addBox(-0.5F, -0.2728F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.5693F, -0.3593F, -0.8378F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = neck2.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6004F, -1.4054F, -0.4968F, 0.1732F, -0.0762F, -0.2206F));

		PartDefinition cube_r415 = rightPlate3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(22, 97).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
		.texOffs(96, 47).mirror().addBox(-0.5F, -1.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6406F, -0.1633F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightPlate3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(41, 87).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false)
		.texOffs(98, 94).mirror().addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightPlate3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(108, 10).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.6898F, -0.162F, 0.4002F, 0.0089F, -0.0046F));

		PartDefinition cube_r418 = rightPlate3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(46, 108).mirror().addBox(-0.5F, -0.5728F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
		.texOffs(108, 7).mirror().addBox(-0.5F, -0.2728F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5693F, -0.3593F, -0.8378F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2275F, -5.7224F, 0.4215F, 0.0F, 0.0F));

		PartDefinition cube_r419 = neck3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(110, 91).addBox(0.5F, -1.15F, -0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 57).addBox(0.0F, -0.65F, -1.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate24 = neck3.addOrReplaceChild("leftPlate24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5607F, -1.0106F, -0.3857F, -0.1584F, 0.0762F, 0.2206F));

		PartDefinition cube_r420 = leftPlate24.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(96, 34).addBox(-0.5F, -1.8929F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r421 = leftPlate24.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(33, 96).addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F))
		.texOffs(96, 25).addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftPlate24.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(107, 69).addBox(-0.5F, 0.8762F, -1.7023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftPlate24.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(107, 60).addBox(-0.5F, -0.4485F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate24 = neck3.addOrReplaceChild("rightPlate24", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5607F, -1.0106F, -0.3857F, -0.1584F, -0.0762F, -0.2206F));

		PartDefinition cube_r424 = rightPlate24.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(96, 34).mirror().addBox(-0.5F, -1.8929F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r425 = rightPlate24.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(96, 25).mirror().addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r426 = rightPlate24.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(107, 69).mirror().addBox(-0.5F, 0.8762F, -1.7023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r427 = rightPlate24.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(107, 60).mirror().addBox(-0.5F, -0.4485F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1048F, -3.0692F, -0.2071F, 0.5673F, 0.2959F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(108, 94).mirror().addBox(-0.5512F, -0.1052F, -0.0186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.3101F, -0.7972F, -1.8177F, 0.3479F, -0.1716F, -0.0392F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(108, 81).mirror().addBox(-0.5512F, -0.1052F, -0.8186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.3101F, -0.7972F, -1.8177F, 0.6001F, -0.151F, -0.0879F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(107, 57).mirror().addBox(-0.0348F, -0.3689F, 0.0445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2851F, -0.1053F, -1.3187F, 0.1921F, 0.4926F, 0.0241F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(107, 50).mirror().addBox(-0.3271F, -0.2294F, -0.2167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1045F, -0.6687F, -1.8577F, 0.4363F, -0.1956F, -0.2486F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(104, 28).mirror().addBox(0.0F, -0.2154F, -0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(104, 21).mirror().addBox(0.0F, 0.0846F, -0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
		.texOffs(104, 28).addBox(1.4F, -0.2154F, -0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(104, 21).addBox(1.4F, 0.0846F, -0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2F, -1.3F, -0.2F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(103, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9402F, -0.6629F, -1.1945F, 0.5869F, 0.7278F, 0.3128F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(71, 109).mirror().addBox(0.0F, -0.2154F, -0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(71, 109).addBox(1.4F, -0.2154F, -0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, -1.3F, -0.2F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(107, 37).mirror().addBox(-0.5F, -1.1333F, -0.9854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
		.texOffs(107, 37).addBox(0.5F, -1.1333F, -0.9854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.2363F, -0.0406F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-0.52F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(109, 27).mirror().addBox(-0.69F, -0.5259F, -0.3966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
		.texOffs(37, 109).mirror().addBox(-0.58F, -0.5259F, -0.3966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(105, 4).mirror().addBox(-0.52F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.79F, 0.0518F, -1.6932F, 0.2724F, -0.4182F, -0.1436F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(105, 88).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(105, 88).addBox(1.02F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.76F, -0.2446F, -0.5598F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-0.5F, -0.2481F, -0.7589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(105, 85).addBox(1.02F, -0.2481F, -0.7589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.76F, -0.2554F, -0.0391F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(103, 100).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false)
		.texOffs(103, 100).addBox(1.02F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.76F, -0.6554F, -0.3392F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(87, 30).mirror().addBox(-0.04F, -1.0742F, -1.0274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, 0.2618F, -0.0698F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(108, 78).mirror().addBox(-0.7661F, -0.5F, -0.4615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1165F, -2.132F, 0.617F, -0.3777F, -0.3036F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(105, 66).mirror().addBox(-0.31F, -0.4934F, -0.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.79F, 0.0518F, -1.6932F, 0.1852F, -0.4182F, -0.1436F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(97, 61).mirror().addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(97, 61).addBox(1.1F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 0.4425F, -0.2708F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(95, 16).mirror().addBox(-0.2F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
		.texOffs(95, 16).addBox(1.4F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.1F, 0.1F, -0.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(46, 83).mirror().addBox(-0.04F, -0.8972F, -2.2971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, 0.384F, -0.0698F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(39, 83).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.6907F, -2.902F, 0.2807F, -0.1006F, -0.029F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(108, 103).mirror().addBox(-0.04F, -1.2438F, -1.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
		.texOffs(86, 0).mirror().addBox(-0.04F, -1.0932F, -2.1252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, 0.4014F, -0.0698F, 0.0F));

		PartDefinition cube_r448 = head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(103, 97).mirror().addBox(-0.04F, -1.4472F, -1.9872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, 0.5236F, -0.0698F, 0.0F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.04F, -1.2119F, -0.7413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, 0.4189F, -0.0698F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(32, 107).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1984F, -2.3831F, -0.0412F, -0.5581F, 0.0218F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(56, 109).mirror().addBox(-0.6F, -0.4512F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(56, 109).addBox(0.6F, -0.4512F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.8357F, -0.9944F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(108, 75).mirror().addBox(-0.0972F, -0.2155F, -0.2532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4F, -2.3F, 0.6147F, -0.3531F, -0.3269F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(74, 103).mirror().addBox(0.0F, 0.9593F, -1.3234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, -1.0996F, -0.0698F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-0.2F, 1.154F, -1.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 1.0268F, -2.8953F, -0.9948F, -0.0698F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(27, 107).mirror().addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
		.texOffs(103, 94).addBox(1.02F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(27, 107).addBox(1.02F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.76F, -0.5475F, -0.4433F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(108, 100).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
		.texOffs(108, 100).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.1637F, -0.6406F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(46, 83).addBox(-0.96F, -0.8972F, -2.2971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, 0.384F, 0.0698F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(39, 83).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.6907F, -2.902F, 0.2807F, 0.1006F, 0.029F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(108, 103).addBox(-0.96F, -1.2438F, -1.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
		.texOffs(86, 0).addBox(-0.96F, -1.0932F, -2.1252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, 0.4014F, 0.0698F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(100, 91).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
		.texOffs(100, 91).addBox(-0.1F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2F, 1.58F, -5.2462F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r461 = head.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(58, 103).addBox(0.3F, -2.3768F, -2.2589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(103, 11).addBox(0.5F, -2.3768F, -2.2589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.2F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r462 = head.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(103, 79).addBox(0.2F, -0.6331F, -2.5436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
		.texOffs(103, 76).addBox(0.6F, -0.6331F, -2.5436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.2F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r463 = head.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(103, 73).addBox(0.2F, -1.411F, -2.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
		.texOffs(103, 8).addBox(0.6F, -1.411F, -2.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.2F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r464 = head.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(103, 97).addBox(-0.96F, -1.4472F, -1.9872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, 0.5236F, 0.0698F, 0.0F));

		PartDefinition cube_r465 = head.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(108, 78).addBox(-0.2339F, -0.5F, -0.4615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.2F, -0.1165F, -2.132F, 0.617F, 0.3777F, 0.3036F));

		PartDefinition cube_r466 = head.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(108, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -0.5998F, -1.1796F, 0.3479F, 0.0F, 0.0F));

		PartDefinition cube_r467 = head.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(108, 94).addBox(-0.4488F, -0.1052F, -0.0186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.3101F, -0.7972F, -1.8177F, 0.3479F, 0.1716F, 0.0392F));

		PartDefinition cube_r468 = head.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(108, 81).addBox(-0.4488F, -0.1052F, -0.8186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.3101F, -0.7972F, -1.8177F, 0.6001F, 0.151F, 0.0879F));

		PartDefinition cube_r469 = head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 86).addBox(-0.96F, -1.2119F, -0.7413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, 0.4189F, 0.0698F, 0.0F));

		PartDefinition cube_r470 = head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(87, 30).addBox(-0.96F, -1.0742F, -1.0274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, 0.2618F, 0.0698F, 0.0F));

		PartDefinition cube_r471 = head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(32, 107).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 0.1984F, -2.3831F, -0.0412F, 0.5581F, -0.0218F));

		PartDefinition cube_r472 = head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(103, 103).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9402F, -0.6629F, -1.1945F, 0.5869F, -0.7278F, -0.3128F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(107, 50).addBox(-0.6729F, -0.2294F, -0.2167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1045F, -0.6687F, -1.8577F, 0.4363F, 0.1956F, 0.2486F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(108, 75).addBox(-0.9028F, -0.2155F, -0.2532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.4F, -2.3F, 0.6147F, 0.3531F, 0.3269F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(74, 103).addBox(-1.0F, 0.9593F, -1.3234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, -1.0996F, 0.0698F, 0.0F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(85, 44).addBox(-0.8F, 1.154F, -1.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.76F, 1.0268F, -2.8953F, -0.9948F, 0.0698F, 0.0F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(109, 27).addBox(-0.31F, -0.5259F, -0.3966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(37, 109).addBox(-0.42F, -0.5259F, -0.3966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(105, 91).addBox(-0.48F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(105, 4).addBox(-0.48F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.79F, 0.0518F, -1.6932F, 0.2724F, 0.4182F, 0.1436F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(107, 57).addBox(-0.9652F, -0.3689F, 0.0445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2851F, -0.1053F, -1.3187F, 0.1921F, -0.4926F, -0.0241F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(105, 66).addBox(-0.69F, -0.4934F, -0.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.79F, 0.0518F, -1.6932F, 0.1852F, 0.4182F, 0.1436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7046F, 0.1521F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(56, 106).mirror().addBox(-0.3F, -0.7439F, -1.2076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.5934F, -0.1047F, 0.0F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(106, 47).mirror().addBox(-0.3F, -0.2537F, -1.4898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.0524F, -0.1047F, 0.0F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(105, 63).mirror().addBox(-0.3F, 0.1034F, -1.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, -0.2618F, -0.1047F, 0.0F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-0.4F, -0.6043F, -1.6268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.3142F, -0.1047F, 0.0F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.4F, -0.8869F, -1.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.5411F, -0.1047F, 0.0F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(-0.4F, -0.7971F, -1.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.4189F, -0.1047F, 0.0F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(63, 105).mirror().addBox(-0.5F, -1.3343F, -1.999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9868F, -1.7924F, 0.3316F, -0.1571F, 0.0F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(97, 106).mirror().addBox(-0.4F, -0.7747F, -0.6651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.2618F, -0.1047F, 0.0F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(14, 82).mirror().addBox(-0.4F, -0.6997F, -1.5379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0439F, -3.6935F, 0.384F, -0.1047F, 0.0F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(105, 54).mirror().addBox(-0.5F, -1.4204F, -1.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9868F, -1.7924F, 0.4189F, -0.1571F, 0.0F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(83, 67).mirror().addBox(-0.5F, -1.2533F, -1.7027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9868F, -1.7924F, 0.2967F, -0.1571F, 0.0F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(109, 17).mirror().addBox(-0.3F, -0.9159F, -2.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
		.texOffs(8, 109).mirror().addBox(-0.3F, -0.9159F, -1.9394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.3142F, -0.0524F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(51, 105).mirror().addBox(-0.3F, -0.439F, -1.8192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
		.texOffs(32, 104).mirror().addBox(-0.3F, -0.739F, -1.6192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.1745F, -0.0524F, 0.0F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(46, 105).mirror().addBox(-0.3F, -0.5978F, -1.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.0175F, -0.0524F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(105, 14).mirror().addBox(-0.3F, -0.1476F, -0.9121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, -0.7156F, -0.0524F, 0.0F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(74, 106).mirror().addBox(-0.5F, -0.539F, -2.1733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(21, 84).mirror().addBox(-0.5F, -0.539F, -1.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9868F, -1.7924F, 0.0F, -0.1571F, 0.0F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-0.3F, -0.5423F, -2.2966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false)
		.texOffs(106, 44).mirror().addBox(-0.3F, -0.1423F, -2.2966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(106, 41).mirror().addBox(-0.3F, -0.1423F, -1.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.2618F, -0.0524F, 0.0F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(-0.5F, -0.8717F, -1.4216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9868F, -1.7924F, 0.2618F, -0.1571F, 0.0F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(-0.3F, -0.1775F, -1.5769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
		.texOffs(106, 31).mirror().addBox(-0.3F, -0.1775F, -1.3769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.2967F, -0.0524F, 0.0F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(106, 24).mirror().addBox(-0.3F, -0.4F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
		.texOffs(10, 106).mirror().addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.5934F, -0.0524F, 0.0F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(83, 59).mirror().addBox(-0.3F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0868F, -0.0924F, 0.2269F, -0.0524F, 0.0F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(56, 106).addBox(-0.7F, -0.7439F, -1.2076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.5934F, 0.1047F, 0.0F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(106, 47).addBox(-0.7F, -0.2537F, -1.4898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.0524F, 0.1047F, 0.0F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(105, 63).addBox(-0.7F, 0.1034F, -1.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, -0.2618F, 0.1047F, 0.0F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(83, 71).addBox(-0.6F, -0.6043F, -1.6268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.3142F, 0.1047F, 0.0F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(0, 107).addBox(-0.6F, -0.8869F, -1.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.5411F, 0.1047F, 0.0F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(102, 106).addBox(-0.6F, -0.7971F, -1.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.4189F, 0.1047F, 0.0F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(63, 105).addBox(-0.5F, -1.3343F, -1.999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.7F, 0.9868F, -1.7924F, 0.3316F, 0.1571F, 0.0F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(97, 106).addBox(-0.6F, -0.7747F, -0.6651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.2618F, 0.1047F, 0.0F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(14, 82).addBox(-0.6F, -0.6997F, -1.5379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.0439F, -3.6935F, 0.384F, 0.1047F, 0.0F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(105, 54).addBox(-0.5F, -1.4204F, -1.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.7F, 0.9868F, -1.7924F, 0.4189F, 0.1571F, 0.0F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(83, 67).addBox(-0.5F, -1.2533F, -1.7027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.7F, 0.9868F, -1.7924F, 0.2967F, 0.1571F, 0.0F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(109, 17).addBox(-0.7F, -0.9159F, -2.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
		.texOffs(8, 109).addBox(-0.7F, -0.9159F, -1.9394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.3142F, 0.0524F, 0.0F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(51, 105).addBox(-0.7F, -0.439F, -1.8192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
		.texOffs(32, 104).addBox(-0.7F, -0.739F, -1.6192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.1745F, 0.0524F, 0.0F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(46, 105).addBox(-0.7F, -0.5978F, -1.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.0175F, 0.0524F, 0.0F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(105, 14).addBox(-0.7F, -0.1476F, -0.9121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, -0.7156F, 0.0524F, 0.0F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(74, 106).addBox(-0.5F, -0.539F, -2.1733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(21, 84).addBox(-0.5F, -0.539F, -1.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.7F, 0.9868F, -1.7924F, 0.0F, 0.1571F, 0.0F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(84, 47).addBox(-0.7F, -0.5423F, -2.2966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F))
		.texOffs(106, 44).addBox(-0.7F, -0.1423F, -2.2966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(106, 41).addBox(-0.7F, -0.1423F, -1.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.2618F, 0.0524F, 0.0F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(83, 63).addBox(-0.5F, -0.8717F, -1.4216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, 0.9868F, -1.7924F, 0.2618F, 0.1571F, 0.0F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(106, 34).addBox(-0.7F, -0.1775F, -1.5769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
		.texOffs(106, 31).addBox(-0.7F, -0.1775F, -1.3769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.2967F, 0.0524F, 0.0F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(106, 24).addBox(-0.7F, -0.4F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
		.texOffs(10, 106).addBox(-0.7F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.5934F, 0.0524F, 0.0F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(83, 59).addBox(-0.7F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.0F, 0.0868F, -0.0924F, 0.2269F, 0.0524F, 0.0F));

		PartDefinition frontleftleg2 = upperbody.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8724F, 7.6427F, -8.1789F, 0.8055F, 0.222F, -0.1465F));

		PartDefinition cube_r522 = frontleftleg2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(39, 74).addBox(-1.0F, 0.0603F, -1.7828F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.7991F, 0.9926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r523 = frontleftleg2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -3.0F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2991F, -1.0074F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r524 = frontleftleg2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0034F, -0.6331F, -2.3516F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 1.5991F, 0.0926F, -2.234F, 0.0F, 0.0F));

		PartDefinition cube_r525 = frontleftleg2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(33, 91).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5307F, 0.9069F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r526 = frontleftleg2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(103, 82).addBox(0.0F, -0.6421F, -1.04F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
		.texOffs(67, 62).addBox(0.0F, 0.2579F, -2.04F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 1.5991F, 0.0926F, -0.8203F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create().texOffs(25, 72).addBox(-1.3351F, 0.3441F, -1.2153F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0914F, 5.5105F, 0.2836F, -0.6168F, 0.07F, 0.1047F));

		PartDefinition cube_r527 = frontleftleg3.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(73, 31).addBox(0.4996F, -1.9987F, -0.3689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r528 = frontleftleg3.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(90, 59).addBox(-1.0F, -2.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3351F, 1.0441F, 1.1847F, -0.1203F, 0.0208F, 0.0042F));

		PartDefinition cube_r529 = frontleftleg3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(76, 59).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3351F, 3.0385F, 0.5673F, -0.0676F, 0.0238F, 0.0046F));

		PartDefinition cube_r530 = frontleftleg3.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(90, 67).addBox(0.4996F, -0.8987F, -1.5688F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create().texOffs(63, 17).addBox(-1.4179F, 0.0265F, -0.9537F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 77).addBox(0.582F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 47).addBox(-2.4078F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0431F, 4.9289F, -0.5483F, 0.5452F, -0.0562F, -0.0206F));

		PartDefinition frontrightleg2 = upperbody.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8724F, 7.6427F, -8.1789F, 0.3523F, 0.0552F, 0.1188F));

		PartDefinition cube_r531 = frontrightleg2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(74, 72).addBox(-1.0F, 0.0603F, -1.7828F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.7991F, 0.9926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r532 = frontrightleg2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(7, 75).addBox(-1.0F, -3.0F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.2991F, -1.0074F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r533 = frontrightleg2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(62, 40).addBox(-0.9966F, -0.6331F, -2.3516F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 1.5991F, 0.0926F, -2.234F, 0.0F, 0.0F));

		PartDefinition cube_r534 = frontrightleg2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(38, 91).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5307F, 0.9069F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r535 = frontrightleg2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(89, 103).addBox(-1.0F, -0.6421F, -1.04F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
		.texOffs(67, 67).addBox(-1.0F, 0.2579F, -2.04F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.5991F, 0.0926F, -0.8203F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create().texOffs(67, 72).addBox(-0.6649F, 0.3441F, -1.2153F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0914F, 5.5105F, 0.2836F, -1.0531F, -0.07F, -0.1047F));

		PartDefinition cube_r536 = frontrightleg3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(77, 52).addBox(-2.4996F, -1.9987F, -0.3689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r537 = frontrightleg3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(90, 63).addBox(-1.0F, -2.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3351F, 1.0441F, 1.1847F, -0.1203F, -0.0208F, -0.0042F));

		PartDefinition cube_r538 = frontrightleg3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(76, 65).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3351F, 3.0385F, 0.5673F, -0.0676F, -0.0238F, -0.0046F));

		PartDefinition cube_r539 = frontrightleg3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(90, 71).addBox(-2.4996F, -0.8987F, -1.5688F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create().texOffs(64, 22).addBox(-0.582F, 0.0265F, -0.9537F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(39, 78).addBox(-1.582F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 78).addBox(1.4078F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0431F, 4.9289F, -0.5483F, 0.5452F, 0.0562F, 0.0206F));

		return LayerDefinition.create(meshdefinition, 116, 116);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

}
