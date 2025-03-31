package fossils.fossils.client.blockentity.model.brachytrachelopan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrachytrachelopanFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Brachytrachelopan;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg8;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Body;
	private final ModelPart Shoulders;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart Neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public BrachytrachelopanFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Brachytrachelopan = this.fossil.getChild("Brachytrachelopan");
		this.leftLeg = this.Brachytrachelopan.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg8 = this.leftLeg3.getChild("leftLeg8");
		this.rightLeg = this.Brachytrachelopan.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg8 = this.rightLeg3.getChild("rightLeg8");
		this.Tail1 = this.Brachytrachelopan.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Body = this.Brachytrachelopan.getChild("Body");
		this.Shoulders = this.Body.getChild("Shoulders");
		this.leftArm = this.Shoulders.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.Shoulders.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.Neck4 = this.Shoulders.getChild("Neck4");
		this.Neck3 = this.Neck4.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Brachytrachelopan = fossil.addOrReplaceChild("Brachytrachelopan", CubeListBuilder.create(), PartPose.offset(1.5572F, -33.4595F, 2.5001F));

		PartDefinition cube_r1 = Brachytrachelopan.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 130).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(121, 71).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -3.216F, 5.6756F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Brachytrachelopan.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 25).addBox(-4.5F, -1.0F, -0.9F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5572F, 0.3425F, -0.6674F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Brachytrachelopan.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 7).addBox(-4.5F, -1.0F, -0.3F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5572F, -0.3256F, -3.0765F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Brachytrachelopan.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 29).addBox(-4.5F, -1.0F, -0.4F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5572F, 1.0908F, 2.0307F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Brachytrachelopan.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 11).addBox(-4.5F, 2.929F, -3.1409F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(29, 84).addBox(-4.5F, 2.929F, -0.0409F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(32, 97).addBox(-0.5F, -0.071F, -0.0409F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -2.3637F, 4.2764F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Brachytrachelopan.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 121).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -3.8637F, 5.7764F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Brachytrachelopan.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 115).addBox(-0.5F, -5.1623F, -0.5712F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -1.761F, 2.8958F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Brachytrachelopan.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, -3.0F, -2.6F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -5.261F, -0.4042F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Brachytrachelopan.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5572F, -0.542F, -2.9986F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Brachytrachelopan.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(128, 130).addBox(-1.0F, -0.8F, 2.3F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(5, 122).addBox(-1.5F, -3.8F, 2.3F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(3, 129).addBox(-1.0F, 0.3F, 7.1F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(122, 0).addBox(-1.5F, -2.7F, 7.1F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(123, 130).addBox(-1.0F, 0.0F, 5.1F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(122, 4).addBox(-1.5F, -3.0F, 5.1F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -6.6622F, -7.004F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Brachytrachelopan.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(78, 130).addBox(-1.0F, 0.7F, -0.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(121, 95).addBox(-1.5F, -2.3F, -0.4F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -4.4698F, 4.742F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Brachytrachelopan.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(105, 130).addBox(-1.0F, 0.7F, 0.2F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(100, 121).addBox(-1.5F, -2.3F, 0.2F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, -5.7782F, 1.9531F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Brachytrachelopan.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-5.4049F, 4.4219F, -0.5891F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5233F, -2.6386F, -5.1658F, -0.1029F, 0.1635F, -0.1194F));

		PartDefinition cube_r14 = Brachytrachelopan.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(97, 123).mirror().addBox(-1.8652F, 0.7463F, -0.5864F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5233F, -2.6386F, -5.1658F, 0.0105F, 0.1927F, 0.5009F));

		PartDefinition cube_r15 = Brachytrachelopan.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(49, 134).mirror().addBox(0.0341F, 0.0543F, -0.3889F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5233F, -2.6386F, -5.1658F, 0.0881F, 0.0782F, 1.686F));

		PartDefinition cube_r16 = Brachytrachelopan.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(49, 134).addBox(-0.0341F, 0.0543F, -0.3889F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4089F, -2.6386F, -5.1658F, 0.0881F, -0.0782F, -1.686F));

		PartDefinition cube_r17 = Brachytrachelopan.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 123).addBox(1.8652F, 0.7463F, -0.5864F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4089F, -2.6386F, -5.1658F, 0.0105F, -0.1927F, -0.5009F));

		PartDefinition cube_r18 = Brachytrachelopan.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 125).addBox(5.4049F, 4.4219F, -0.5891F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4089F, -2.6386F, -5.1658F, -0.1029F, -0.1635F, 0.1194F));

		PartDefinition cube_r19 = Brachytrachelopan.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(109, 99).addBox(-1.2173F, 0.2919F, -1.2674F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8399F, -3.2394F, -4.875F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Brachytrachelopan.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(62, 108).mirror().addBox(-1.3741F, -2.7652F, -1.0501F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, -3.2394F, -4.875F, -0.1058F, -0.1654F, -0.9517F));

		PartDefinition cube_r21 = Brachytrachelopan.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 108).addBox(0.3741F, -2.7652F, -1.0501F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8399F, -3.2394F, -4.875F, -0.1058F, 0.1654F, 0.9517F));

		PartDefinition cube_r22 = Brachytrachelopan.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 105).addBox(-0.5F, -4.2F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5572F, -5.8249F, -4.8236F, -0.096F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Brachytrachelopan.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(0.0352F, 0.1629F, 5.0012F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6572F, 9.6181F, 0.7571F, -1.9024F, 0.0F, -0.3142F));

		PartDefinition Basin_r2 = Brachytrachelopan.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(0.0352F, -0.2363F, -0.367F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6572F, 9.6181F, 0.7571F, -2.1642F, 0.0F, -0.3142F));

		PartDefinition Basin_r3 = Brachytrachelopan.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(9, 32).mirror().addBox(-0.4597F, -1.0073F, 5.0075F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 44).mirror().addBox(-0.4597F, -0.6073F, -0.7925F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8572F, 8.0181F, 3.0571F, -0.9431F, 0.0308F, -0.4787F));

		PartDefinition Basin_r4 = Brachytrachelopan.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(0.0F, -1.8849F, -0.2763F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1572F, 6.3181F, 0.7571F, -1.2566F, 0.0F, -0.4363F));

		PartDefinition Basin_r5 = Brachytrachelopan.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(42, 18).mirror().addBox(0.0F, -6.6638F, -0.0016F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4572F, 5.3595F, -2.7001F, -1.7044F, -0.0407F, -0.294F));

		PartDefinition Basin_r6 = Brachytrachelopan.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(21, 34).mirror().addBox(-1.0F, -0.2F, 5.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 34).addBox(7.8F, -0.2F, 5.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(61, 0).addBox(2.9F, 0.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.4572F, 1.4595F, -5.5001F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Basin_r7 = Brachytrachelopan.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-1.0F, -6.9978F, -1.6249F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 51).mirror().addBox(-1.0F, -6.9978F, -2.6249F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 51).addBox(4.8F, -6.9978F, -2.6249F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 94).addBox(7.8F, -6.9978F, -1.6249F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.4572F, 2.9595F, -2.7001F, -1.7104F, 0.0F, 0.0F));

		PartDefinition Basin_r8 = Brachytrachelopan.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(57, 18).mirror().addBox(-1.0F, 0.0853F, -4.871F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(57, 18).addBox(7.8F, 0.0853F, -4.871F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.4572F, 2.7595F, 5.7999F, -0.925F, 0.0F, 0.0F));

		PartDefinition Basin_r9 = Brachytrachelopan.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-1.0F, -0.1637F, -3.0504F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4572F, -0.9405F, 2.6999F, -0.4728F, -0.0777F, 0.0397F));

		PartDefinition Basin_r10 = Brachytrachelopan.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-1.0F, -2.822F, -4.68F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.4572F, 0.3595F, -0.0001F, 0.1222F, 0.3491F, 0.1658F));

		PartDefinition Basin_r11 = Brachytrachelopan.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(19, 84).mirror().addBox(-1.0F, 0.0393F, -7.0714F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.4572F, 0.3595F, -0.0001F, 0.192F, 0.3491F, 0.1658F));

		PartDefinition Basin_r12 = Brachytrachelopan.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(-1.0F, -5.6573F, -6.4902F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4572F, 0.3595F, -0.0001F, 1.0821F, 0.3491F, 0.1658F));

		PartDefinition Basin_r13 = Brachytrachelopan.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(61, 0).addBox(-1.0F, -1.8849F, -0.2763F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0428F, 6.3181F, 0.7571F, -1.2566F, 0.0F, 0.4363F));

		PartDefinition Basin_r14 = Brachytrachelopan.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0352F, 0.1629F, 5.0012F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5428F, 9.6181F, 0.7571F, -1.9024F, 0.0F, 0.3142F));

		PartDefinition Basin_r15 = Brachytrachelopan.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(9, 32).addBox(-0.5403F, -1.0073F, 5.0075F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 44).addBox(-0.5403F, -0.6073F, -0.7925F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7428F, 8.0181F, 3.0571F, -0.9431F, -0.0308F, 0.4787F));

		PartDefinition Basin_r16 = Brachytrachelopan.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(56, 92).addBox(-1.0352F, -0.2363F, -0.367F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5428F, 9.6181F, 0.7571F, -2.1642F, 0.0F, 0.3142F));

		PartDefinition Basin_r17 = Brachytrachelopan.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(42, 18).addBox(-1.0F, -6.6638F, -0.0016F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3428F, 5.3595F, -2.7001F, -1.7044F, 0.0407F, 0.294F));

		PartDefinition Basin_r18 = Brachytrachelopan.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(19, 84).addBox(0.0F, 0.0393F, -7.0714F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.3428F, 0.3595F, -0.0001F, 0.192F, -0.3491F, -0.1658F));

		PartDefinition Basin_r19 = Brachytrachelopan.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(71, 92).addBox(0.0F, -5.6573F, -6.4902F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3428F, 0.3595F, -0.0001F, 1.0821F, -0.3491F, -0.1658F));

		PartDefinition Basin_r20 = Brachytrachelopan.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(40, 95).addBox(0.0F, -2.822F, -4.68F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3428F, 0.3595F, -0.0001F, 0.1222F, -0.3491F, -0.1658F));

		PartDefinition Basin_r21 = Brachytrachelopan.addOrReplaceChild("Basin_r21", CubeListBuilder.create().texOffs(64, 44).addBox(0.0F, -0.1637F, -3.0504F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3428F, -0.9405F, 2.6999F, -0.4728F, 0.0777F, -0.0397F));

		PartDefinition leftLeg = Brachytrachelopan.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 53).addBox(-1.1F, -1.3013F, -12.7282F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4428F, 4.4095F, 0.8999F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 97).addBox(-0.5F, -1.8F, -4.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4987F, -3.0282F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 89).addBox(-2.5F, -0.3663F, -2.2973F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6851F, -13.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.6003F, -15.7619F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 101).addBox(-1.5F, -8.0721F, -5.8503F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.5893F, 4.2702F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(76, 14).addBox(-1.5F, -8.1F, -8.8923F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 7.9357F, -0.0836F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(52, 61).addBox(0.5F, -5.6869F, -7.604F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.4F, 6.4175F, -1.6699F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(76, 33).addBox(-4.0F, -3.6172F, -4.0411F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6175F, -9.6699F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(89, 15).addBox(-3.0F, -12.0202F, -6.5051F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7023F, 10.4031F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg3.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5364F, 9.8139F));

		PartDefinition cube_r29 = leftLeg8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 0).addBox(1.4004F, -1.5267F, -12.9543F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.1F, 0.2651F, -0.9006F, 0.0F, 0.0F, 0.192F));

		PartDefinition rightLeg = Brachytrachelopan.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(43, 44).addBox(-1.9F, -1.3013F, -12.7282F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5572F, 4.4095F, 0.8999F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -1.8F, -4.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.4987F, -3.0282F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(93, 79).addBox(-1.5F, -0.3663F, -2.2973F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.6851F, -13.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6003F, -15.7619F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(73, 101).addBox(-0.5F, -8.0721F, -5.8503F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.5893F, 4.2702F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 73).addBox(-0.5F, -8.1F, -8.8923F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 7.9357F, -0.0836F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(42, 18).addBox(-2.5F, -5.6869F, -7.604F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4F, 6.4175F, -1.6699F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(38, 61).addBox(-4.0F, -3.6172F, -4.0411F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6175F, -9.6699F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(14, 72).addBox(-3.0F, -12.0202F, -6.5051F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7023F, 10.4031F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg3.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5364F, 9.8139F));

		PartDefinition cube_r36 = rightLeg8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(67, 76).addBox(-9.4004F, -1.5267F, -12.9543F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.1F, 0.2651F, -0.9006F, 0.0F, 0.0F, -0.192F));

		PartDefinition Tail1 = Brachytrachelopan.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(68, 64).addBox(-1.0F, -0.7357F, 0.5625F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, 3.5595F, 4.5999F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition cube_r37 = Tail1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(49, 8).addBox(0.0F, -3.7232F, 1.2163F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(104, 83).addBox(0.0F, -2.1816F, -0.2881F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(106, 0).addBox(0.0F, -0.5634F, -1.6078F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(118, 48).addBox(0.0F, 1.2461F, -2.4656F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6254F, 5.9646F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Tail1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(100, 128).addBox(-0.5F, -0.749F, -0.6483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.1333F, 10.2046F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Tail1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(119, 111).addBox(-0.5F, 1.9534F, -1.9173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(114, 55).addBox(-1.5F, 1.9534F, -1.1173F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 12).addBox(-0.5F, 0.9534F, -1.1173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.1333F, 10.2046F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Tail1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(124, 18).addBox(-1.5F, -4.065F, 0.3446F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2333F, 9.7046F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Tail1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(128, 95).addBox(-0.5F, -3.5469F, -0.283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2333F, 9.7046F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Tail1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 30).addBox(-1.5F, -2.0795F, -0.3505F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2333F, 9.7046F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(133, 81).addBox(-1.0F, -0.1154F, -0.1968F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1333F, 10.2046F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Tail1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(119, 118).addBox(-0.5F, 1.9546F, -1.8818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(114, 80).addBox(-1.5F, 1.9546F, -1.0818F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-0.5F, 0.9546F, -1.0818F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.2349F, 7.6691F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Tail1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(124, 21).addBox(-1.5F, -4.0685F, 0.3799F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2349F, 7.6691F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(128, 113).addBox(-0.5F, -3.551F, -0.2477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2349F, 7.6691F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 30).addBox(-1.5F, -2.0942F, -0.3182F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2349F, 7.6691F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Tail1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(65, 18).addBox(-0.5F, -1.7603F, -0.6146F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.2349F, 7.6691F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Tail1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(127, 121).addBox(-1.0F, -1.1238F, -0.1622F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2349F, 7.6691F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Tail1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(128, 45).addBox(-1.0F, -1.3302F, -0.359F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4002F, 5.6312F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Tail1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(129, 0).addBox(-0.5F, -1.86F, -0.9512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3002F, 6.2312F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Tail1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(12, 82).addBox(-0.5F, -1.9487F, -0.8287F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.4002F, 5.6312F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Tail1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, 0.7032F, -1.2163F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(114, 86).addBox(-1.5F, 1.7032F, -1.2163F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 41).addBox(-0.5F, 1.7032F, -2.0163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.4002F, 5.6312F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Tail1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(124, 34).addBox(-1.5F, -1.9954F, -0.046F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7002F, 5.9312F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Tail1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(11, 51).addBox(-1.5F, -2.2593F, -0.5508F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4002F, 5.6312F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Tail1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -3.945F, -0.0159F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8002F, 2.4312F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Tail1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(129, 102).addBox(-1.0F, -1.3302F, -0.359F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6002F, 3.6312F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Tail1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(61, 121).addBox(-1.5F, -4.2593F, -0.5508F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6002F, 3.6312F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Tail1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(113, 120).addBox(-0.5F, 1.7032F, -2.0163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(115, 12).addBox(-1.5F, 1.7032F, -1.2163F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(-0.5F, -0.2968F, -1.2163F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.6002F, 3.6312F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Tail1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(118, 129).addBox(-1.0F, -1.6349F, -0.2995F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6092F, 1.0229F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Tail1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(90, 108).addBox(-0.5F, -4.2354F, -1.2969F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6092F, 1.0229F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Tail1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(121, 67).addBox(-1.5F, -4.4666F, -0.8059F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6092F, 1.0229F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Tail1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(115, 16).addBox(-1.5F, 1.9817F, -1.0231F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 121).addBox(-0.5F, 1.9817F, -1.8231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(108, 115).addBox(-0.5F, -1.0183F, -1.0231F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.6092F, 1.0229F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3224F, 9.0565F, -0.0447F, 0.218F, -0.0097F));

		PartDefinition cube_r64 = Tail2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0261F, 0.3191F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Tail2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(90, 130).addBox(-0.5F, -0.532F, -0.2216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.2434F, 11.6924F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Tail2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(83, 130).addBox(0.0F, -3.4484F, 2.7908F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 130).addBox(0.0F, -2.5484F, 1.2908F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 127).addBox(-0.5F, -2.1484F, -0.1092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2434F, 11.6924F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Tail2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(51, 14).addBox(-1.0F, -0.6863F, 0.3218F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2434F, 11.6924F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Tail2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(90, 79).addBox(-0.5F, 0.5646F, -1.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7434F, 10.1924F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Tail2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(29, 56).addBox(-1.0F, -0.6863F, 0.3218F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(-0.5F, -0.532F, -0.2216F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.7434F, 10.1924F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Tail2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(18, 127).addBox(-0.5F, -2.1484F, -0.1092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7434F, 10.1924F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Tail2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(125, 8).addBox(-1.5F, -3.4484F, 2.108F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2434F, 9.7924F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Tail2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(29, 88).addBox(-1.5F, -2.4484F, 0.508F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7434F, 10.1924F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Tail2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 95).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1566F, 7.834F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Tail2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(37, 97).addBox(-1.5F, -1.9231F, 0.1494F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5869F, 9.1277F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Tail2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 53).addBox(-0.5F, 0.8423F, -0.2768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.2444F, 9.5357F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Tail2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(38, 127).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3655F, 9.812F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Tail2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(61, 14).addBox(-1.0F, -0.0759F, 0.1431F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5869F, 9.1277F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Tail2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(21, 64).addBox(-1.5F, 1.4865F, -1.1287F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7431F, 8.9321F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Tail2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 101).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2566F, 5.834F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Tail2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 68).addBox(-1.5F, 1.4865F, -1.1287F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8431F, 6.9321F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Tail2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(64, 56).addBox(-1.0F, -0.0759F, 0.1431F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9869F, 7.4277F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Tail2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(127, 41).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7655F, 8.112F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Tail2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, 0.8423F, -0.2768F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.6444F, 7.8357F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Tail2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 101).addBox(-1.5F, -1.9231F, 0.1494F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9869F, 7.4277F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r85 = Tail2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(114, 7).addBox(-1.5F, -2.0228F, 0.319F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7444F, 5.5357F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5F, -0.1577F, -0.2768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.7444F, 5.5357F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(11, 25).addBox(-0.5F, -1.8045F, -0.2782F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7444F, 5.5357F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(133, 70).addBox(-1.0F, -0.2232F, 0.2735F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7444F, 5.5357F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 88).addBox(-1.5F, 1.2865F, -0.9287F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1431F, 4.9321F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 25).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5566F, 3.834F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(44, 119).addBox(-0.5F, 1.9534F, -1.9173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(113, 39).addBox(-1.5F, 1.9534F, -1.1173F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1796F, 3.1061F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(9, 65).addBox(-1.0F, 0.1846F, 0.0032F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1796F, 3.1061F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(118, 27).addBox(0.0F, -0.4567F, -0.8047F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6505F, 13.8356F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(109, 80).addBox(0.0F, -0.5518F, -2.1932F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1466F, 11.8878F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(109, 86).addBox(0.0F, -10.4908F, 6.0072F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(109, 6).addBox(0.0F, -8.8851F, 4.5714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(108, 39).addBox(0.0F, -7.1767F, 3.4175F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(107, 93).addBox(0.0F, -5.4341F, 2.3576F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1791F, -3.1339F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(36, 12).addBox(-1.5F, -2.0795F, -0.3505F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8796F, 2.7061F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(81, 83).addBox(-0.5F, -0.7382F, -0.537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5096F, 3.5245F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(121, 115).addBox(-1.5F, -1.2612F, 0.0416F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5096F, 3.5245F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Tail2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(57, 18).addBox(-0.5F, -0.749F, -0.6483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.7796F, 3.2061F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(59, 18).addBox(-1.0F, -0.8763F, -0.2043F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6485F, 15.8965F, 0.0909F, 0.3923F, 0.0181F));

		PartDefinition cube_r100 = Tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 8).addBox(0.0F, -9.0484F, 12.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 0).addBox(0.0F, -7.6484F, 10.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 0).addBox(0.0F, -6.3484F, 8.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 43).addBox(0.0F, -5.1484F, 6.1908F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 59).addBox(0.0F, -4.0484F, 4.1908F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8937F, -4.1309F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Tail3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(13, 127).addBox(0.0F, -11.3175F, 6.1203F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 42).addBox(0.0F, -9.4892F, 4.2163F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(114, 104).addBox(0.0F, -7.635F, 3.4089F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(116, 43).addBox(0.0F, -5.8326F, 2.4083F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(118, 7).addBox(0.0F, -4.0301F, 1.4077F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 118).addBox(0.0F, -2.2794F, 0.2139F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0003F, -1.9877F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0037F, -0.3459F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0009F, 12.0075F, 0.2778F, 0.3367F, 0.0939F));

		PartDefinition cube_r102 = Tail4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(100, 116).addBox(0.0F, -18.6018F, 26.1007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 116).addBox(0.0F, -17.338F, 24.4235F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 116).addBox(0.0F, -16.1344F, 22.8263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 33).addBox(0.0F, -14.8706F, 21.1491F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 0).addBox(0.0F, -13.8869F, 19.5113F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 84).addBox(0.0F, -12.8477F, 17.891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 44).addBox(0.0F, -12.0484F, 16.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 44).addBox(0.0F, -10.7484F, 14.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3211F, -15.7726F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Tail4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(72, 92).addBox(0.0F, -25.3737F, 13.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 97).addBox(0.0F, -23.6417F, 12.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 105).addBox(0.0F, -21.9096F, 11.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 28).addBox(0.0F, -20.1776F, 10.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(126, 49).addBox(0.0F, -18.4455F, 9.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(126, 73).addBox(0.0F, -16.7135F, 8.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 127).addBox(0.0F, -14.9814F, 7.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(127, 11).addBox(0.0F, -13.2494F, 6.638F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5729F, -13.6294F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4345F, 16.7818F, 0.0915F, 0.3042F, 0.0275F));

		PartDefinition cube_r104 = Tail5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, 0.0F, -0.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5296F, -0.1754F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Tail5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(96, 33).addBox(0.0F, -0.9281F, 0.4093F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.913F, 14.2986F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Tail5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(97, 0).addBox(0.0F, -26.6151F, 37.1275F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 33).addBox(0.0F, -25.4705F, 35.4844F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 101).addBox(0.0F, -24.241F, 33.8943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 22).addBox(0.0F, -23.0116F, 32.3042F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 67).addBox(0.0F, -21.8669F, 30.6611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 92).addBox(0.0F, -20.7223F, 29.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 116).addBox(0.0F, -19.5776F, 27.3749F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.747F, -32.502F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Tail5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -39.8358F, 21.8659F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 70).addBox(0.0F, -38.0828F, 20.8826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 44).addBox(0.0F, -36.3297F, 19.8993F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 60).addBox(0.0F, -34.5194F, 18.9978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 89).addBox(0.0F, -32.709F, 18.0964F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 92).addBox(0.0F, -30.8986F, 17.195F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 92).addBox(0.0F, -29.1456F, 16.2117F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 42).addBox(0.0F, -27.3926F, 15.2284F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.147F, -30.3588F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.9641F, 15.8472F, 0.0038F, 0.4728F, -0.1101F));

		PartDefinition cube_r108 = Tail6.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(21, 56).addBox(-0.5F, -0.3F, 0.1F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0716F, -0.2595F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Tail6.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(36, 24).addBox(0.0F, -46.8423F, 25.6948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 61).addBox(0.0F, -45.0683F, 24.7713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(0.0F, -43.2943F, 23.8479F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 44).addBox(0.0F, -41.5203F, 22.9244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.005F, -46.1429F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2973F, 13.8481F, -0.5388F, 0.3554F, -0.0352F));

		PartDefinition cube_r110 = Tail7.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.1244F, -0.2267F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8244F, 16.7733F, 0.0967F, 0.7501F, 0.09F));

		PartDefinition cube_r111 = Tail8.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 34).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.9F, -0.4523F, -0.3367F, 0.0939F));

		PartDefinition Body = Brachytrachelopan.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(-1.5572F, 2.8595F, -5.2001F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -2.9695F, -0.0758F, 18.0F, 3.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 16.7114F, -7.3456F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(40, 34).addBox(-7.0F, -1.8822F, -0.0414F, 14.0F, 2.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 16.0114F, -14.3456F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8F, -12.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(90, 41).mirror().addBox(0.0603F, 0.0336F, -0.5377F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3661F, -6.498F, -2.0656F, 0.0275F, -0.0379F, 1.6673F));

		PartDefinition cube_r116 = Body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(73, 121).mirror().addBox(-1.8239F, 0.7553F, -0.7329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3661F, -6.498F, -2.0656F, 0.0954F, 0.0923F, 0.4956F));

		PartDefinition cube_r117 = Body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(0.0251F, 0.0299F, -0.5978F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1666F, -1.4724F, -1.3906F, 0.0474F, 0.1239F, 0.0578F));

		PartDefinition cube_r118 = Body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(23, 106).mirror().addBox(-5.345F, 4.4837F, -0.9021F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2661F, -6.598F, -4.3656F, 0.1098F, 0.1069F, 0.0839F));

		PartDefinition cube_r119 = Body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(94, 123).mirror().addBox(-1.7806F, 0.7626F, -0.8994F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2661F, -6.598F, -4.3656F, 0.151F, 0.0249F, 0.6908F));

		PartDefinition cube_r120 = Body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(52, 134).mirror().addBox(0.0861F, 0.0122F, -0.7066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2661F, -6.598F, -4.3656F, -0.0131F, -0.1152F, 1.8624F));

		PartDefinition cube_r121 = Body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(9, 92).mirror().addBox(0.1254F, -0.2291F, -0.602F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -6.798F, -6.7656F, -0.0336F, -0.1538F, 1.935F));

		PartDefinition cube_r122 = Body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(74, 63).mirror().addBox(-1.552F, 0.7124F, -0.7731F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -6.798F, -6.7656F, 0.1787F, -0.0088F, 0.7608F));

		PartDefinition cube_r123 = Body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(14, 106).mirror().addBox(-5.1289F, 4.5737F, -0.7758F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -6.798F, -6.7656F, 0.1519F, 0.0949F, 0.158F));

		PartDefinition cube_r124 = Body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(11, 101).mirror().addBox(-5.2398F, 4.5966F, -0.6845F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -7.298F, -9.7656F, 0.2192F, 0.0754F, 0.1812F));

		PartDefinition cube_r125 = Body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(76, 121).mirror().addBox(-1.6297F, 0.7948F, -0.6818F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -7.298F, -9.7656F, 0.2231F, -0.0627F, 0.7767F));

		PartDefinition cube_r126 = Body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 134).mirror().addBox(0.1705F, -0.1349F, -0.5007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -7.298F, -9.7656F, -0.067F, -0.2155F, 1.9586F));

		PartDefinition cube_r127 = Body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -7.498F, -11.8656F, -0.0754F, -0.2308F, 1.9954F));

		PartDefinition cube_r128 = Body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(12, 119).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -7.498F, -11.8656F, 0.2343F, -0.0762F, 0.8108F));

		PartDefinition cube_r129 = Body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(26, 94).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1661F, -7.498F, -11.8656F, 0.236F, 0.0705F, 0.2173F));

		PartDefinition cube_r130 = Body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(90, 41).addBox(-0.0603F, 0.0336F, -0.5377F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3661F, -6.498F, -2.0656F, 0.0275F, 0.0379F, -1.6673F));

		PartDefinition cube_r131 = Body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(73, 121).addBox(1.8239F, 0.7553F, -0.7329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3661F, -6.498F, -2.0656F, 0.0954F, -0.0923F, -0.4956F));

		PartDefinition cube_r132 = Body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(49, 18).addBox(-0.0251F, 0.0299F, -0.5978F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1666F, -1.4724F, -1.3906F, 0.0474F, -0.1239F, -0.0578F));

		PartDefinition cube_r133 = Body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 123).addBox(1.7806F, 0.7626F, -0.8994F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2661F, -6.598F, -4.3656F, 0.151F, -0.0249F, -0.6908F));

		PartDefinition cube_r134 = Body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(52, 134).addBox(-0.0861F, 0.0122F, -0.7066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2661F, -6.598F, -4.3656F, -0.0131F, 0.1152F, -1.8624F));

		PartDefinition cube_r135 = Body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(23, 106).addBox(5.345F, 4.4837F, -0.9021F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2661F, -6.598F, -4.3656F, 0.1098F, -0.1069F, -0.0839F));

		PartDefinition cube_r136 = Body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(9, 92).addBox(-0.1254F, -0.2291F, -0.602F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -6.798F, -6.7656F, -0.0336F, 0.1538F, -1.935F));

		PartDefinition cube_r137 = Body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 63).addBox(1.552F, 0.7124F, -0.7731F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -6.798F, -6.7656F, 0.1787F, 0.0088F, -0.7608F));

		PartDefinition cube_r138 = Body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(14, 106).addBox(5.1289F, 4.5737F, -0.7758F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -6.798F, -6.7656F, 0.1519F, -0.0949F, -0.158F));

		PartDefinition cube_r139 = Body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(76, 121).addBox(1.6297F, 0.7948F, -0.6818F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -7.298F, -9.7656F, 0.2231F, 0.0627F, -0.7767F));

		PartDefinition cube_r140 = Body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(11, 101).addBox(5.2398F, 4.5966F, -0.6845F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -7.298F, -9.7656F, 0.2192F, -0.0754F, -0.1812F));

		PartDefinition cube_r141 = Body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(59, 134).addBox(-0.1705F, -0.1349F, -0.5007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -7.298F, -9.7656F, -0.067F, 0.2155F, -1.9586F));

		PartDefinition cube_r142 = Body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(26, 94).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -7.498F, -11.8656F, 0.236F, -0.0705F, -0.2173F));

		PartDefinition cube_r143 = Body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(12, 119).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -7.498F, -11.8656F, 0.2343F, 0.0762F, -0.8108F));

		PartDefinition cube_r144 = Body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 83).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1661F, -7.498F, -11.8656F, -0.0754F, 0.2308F, -1.9954F));

		PartDefinition cube_r145 = Body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(8, 131).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(31, 122).addBox(-1.5F, -3.8F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.5217F, -1.8039F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(102, 105).addBox(-0.5F, -3.5F, -0.6F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -9.629F, -2.4738F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(69, 108).mirror().addBox(-1.3488F, -2.785F, -1.2461F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7173F, -6.7212F, -1.792F, -0.1316F, -0.2009F, -0.947F));

		PartDefinition cube_r148 = Body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4913F, -2.752F, -1.8072F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -6.9952F, -3.8191F, -0.055F, -0.0941F, -0.9583F));

		PartDefinition cube_r149 = Body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2885F, -6.4912F, -6.8745F, -0.2367F, -0.0337F, -0.8692F));

		PartDefinition cube_r150 = Body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(10, 12).mirror().addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2885F, -6.9912F, -9.3745F, -0.2083F, -0.0094F, -0.9123F));

		PartDefinition cube_r151 = Body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(114, 67).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9167F, -7.7221F, -11.8552F, -0.3533F, 0.058F, -0.6976F));

		PartDefinition cube_r152 = Body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(59, 124).mirror().addBox(0.11F, -2.5F, -0.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 124).addBox(0.69F, -2.5F, -0.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -9.1482F, -11.8189F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(79, 121).mirror().addBox(5.2661F, -8.0351F, -0.6841F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 121).addBox(6.0661F, -8.0351F, -0.6841F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6661F, -4.398F, -10.3656F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(69, 108).addBox(0.3488F, -2.785F, -1.2461F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7173F, -6.7212F, -1.792F, -0.1316F, 0.2009F, 0.947F));

		PartDefinition cube_r155 = Body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(115, 0).addBox(-1.2173F, -1.9179F, 0.0664F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7173F, -6.9212F, -2.792F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(32, 107).addBox(-1.2173F, -0.7874F, -1.4496F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7173F, -6.7212F, -1.792F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(13, 131).addBox(-1.6679F, -3.4962F, 0.432F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(122, 104).addBox(-2.1679F, -6.4962F, 0.432F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.9952F, -4.7191F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5F, -1.8F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.2408F, -4.9466F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, -4.0F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -9.1384F, -4.4005F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 0).addBox(0.4913F, -2.752F, -1.8072F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -6.9952F, -3.8191F, -0.055F, 0.0941F, 0.9583F));

		PartDefinition cube_r161 = Body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(76, 108).addBox(-1.1679F, 0.2062F, -2.0272F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.9952F, -3.8191F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9311F, -6.8521F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2885F, -6.4912F, -6.8745F, -0.2367F, 0.0337F, 0.8692F));

		PartDefinition cube_r164 = Body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 34).addBox(-1.0F, 0.1F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.5F, -8.8109F, -6.6451F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(83, 108).addBox(-1.0F, -4.4128F, -1.9962F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -8.8109F, -5.6451F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(133, 84).addBox(-1.0F, -3.2F, -0.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(120, 122).addBox(-1.5F, -6.2F, -0.1F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2295F, -6.2797F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(39, 112).addBox(-1.0F, -3.7128F, -1.9962F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -9.3109F, -8.1451F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(82, 61).addBox(-1.0F, -0.1F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.5F, -9.3109F, -9.1451F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(133, 87).addBox(-1.0F, -2.5F, -0.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(15, 123).addBox(-1.5F, -5.5F, -0.1F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.7295F, -8.7797F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(10, 12).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2885F, -6.9912F, -9.3745F, -0.2083F, 0.0094F, 0.9123F));

		PartDefinition cube_r171 = Body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(46, 112).addBox(-1.2234F, 0.715F, -1.0361F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7234F, -7.137F, -9.5764F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(114, 67).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9167F, -7.7221F, -11.8552F, -0.3533F, -0.058F, 0.6976F));

		PartDefinition cube_r173 = Body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(77, 14).addBox(-6.1661F, -3.6734F, -2.1758F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6661F, -3.998F, -10.0656F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(37, 72).addBox(-1.0F, -0.0331F, -0.0113F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.4F, -5.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Shoulders = Body.addOrReplaceChild("Shoulders", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -12.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Shoulders.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(41, 129).mirror().addBox(-0.29F, -0.0073F, -1.9189F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 129).addBox(0.29F, -0.0073F, -1.9189F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0495F, -1.1028F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Shoulders.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(62, 129).mirror().addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 129).addBox(0.8F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -7.1897F, -2.3585F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Shoulders.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(65, 129).mirror().addBox(-0.41F, 0.0506F, -0.7966F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 129).addBox(0.41F, 0.0506F, -0.7966F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.8495F, -2.1028F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Shoulders.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(108, 13).mirror().addBox(-0.8F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1914F, -5.1289F, -2.2854F, 0.0217F, 0.0882F, -0.7827F));

		PartDefinition cube_r179 = Shoulders.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(72, 129).mirror().addBox(-0.41F, -4.0186F, -0.9772F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 129).addBox(0.41F, -4.0186F, -0.9772F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9495F, -3.3028F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Shoulders.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(107, 49).mirror().addBox(-0.4F, -1.9467F, -0.9646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 49).addBox(0.4F, -1.9467F, -0.9646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.6495F, -5.0028F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Shoulders.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.4F, -3.8551F, -4.028F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 82).addBox(0.4F, -3.8551F, -4.028F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6495F, -3.7028F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Shoulders.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-0.29F, -0.5094F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 132).addBox(0.29F, -0.5094F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2495F, -5.5028F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Shoulders.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(119, 20).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5361F, -4.426F, -4.6862F, 0.1406F, 0.1416F, -0.6875F));

		PartDefinition cube_r184 = Shoulders.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-0.29F, -0.0761F, -0.9762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 0).addBox(0.29F, -0.0761F, -0.9762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3495F, -6.0028F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Shoulders.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(44, 123).mirror().addBox(-0.4F, -6.0916F, -0.8809F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 123).addBox(0.4F, -6.0916F, -0.8809F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2495F, -6.0028F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Shoulders.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(75, 129).mirror().addBox(-0.29F, -0.0326F, -0.0659F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 129).addBox(0.29F, -0.0326F, -0.0659F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7495F, -9.3028F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Shoulders.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(123, 45).mirror().addBox(-0.4157F, -2.9864F, -2.0641F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0113F, -3.5077F, -6.0724F, 0.3506F, 0.1806F, -0.6748F));

		PartDefinition cube_r188 = Shoulders.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(112, 73).mirror().addBox(-0.29F, 0.026F, -0.9212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 73).addBox(0.29F, 0.026F, -0.9212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7495F, -8.7028F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Shoulders.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(39, 132).mirror().addBox(-0.29F, -0.048F, -0.0001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 132).addBox(0.29F, -0.048F, -0.0001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7495F, -11.6028F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Shoulders.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(56, 123).mirror().addBox(-0.4F, -5.974F, -0.9212F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 123).addBox(0.4F, -5.974F, -0.9212F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7495F, -8.7028F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Shoulders.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(123, 53).mirror().addBox(-0.7F, -2.4F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9829F, -2.7104F, -10.0939F, 0.4213F, 0.3644F, -0.6717F));

		PartDefinition cube_r192 = Shoulders.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(108, 13).addBox(-0.2F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1914F, -5.1289F, -2.2854F, 0.0217F, -0.0882F, 0.7827F));

		PartDefinition cube_r193 = Shoulders.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(62, 101).mirror().addBox(-0.39F, -8.6941F, 2.4593F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 101).addBox(0.39F, -8.6941F, 2.4593F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2495F, -1.6028F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Shoulders.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -4.3749F, -0.9579F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3495F, -1.8028F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Shoulders.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(111, 47).addBox(-0.5F, -4.942F, -1.0937F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6495F, -3.7028F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Shoulders.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(119, 20).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5361F, -4.426F, -4.6862F, 0.1406F, -0.1416F, 0.6875F));

		PartDefinition cube_r197 = Shoulders.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(123, 45).addBox(-0.5843F, -2.9864F, -2.0641F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0113F, -3.5077F, -6.0724F, 0.3506F, -0.1806F, 0.6748F));

		PartDefinition cube_r198 = Shoulders.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(110, 59).addBox(-0.5F, -4.6424F, -0.893F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2495F, -6.3028F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Shoulders.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(123, 53).addBox(-0.3F, -2.4F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9829F, -2.7104F, -10.0939F, 0.4213F, -0.3644F, 0.6717F));

		PartDefinition cube_r200 = Shoulders.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(53, 95).mirror().addBox(-5.548F, 4.564F, -0.4825F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5064F, -5.9017F, -2.3838F, 0.2444F, 0.068F, 0.183F));

		PartDefinition cube_r201 = Shoulders.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(41, 119).mirror().addBox(-1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5064F, -5.9017F, -2.3838F, 0.2398F, -0.0829F, 0.7755F));

		PartDefinition cube_r202 = Shoulders.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5064F, -5.9017F, -2.3838F, -0.0797F, -0.2385F, 1.9614F));

		PartDefinition cube_r203 = Shoulders.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(22, 94).mirror().addBox(0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4064F, -5.2017F, -5.3838F, -0.1144F, -0.2998F, 1.9532F));

		PartDefinition cube_r204 = Shoulders.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(85, 123).mirror().addBox(-1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4064F, -5.2017F, -5.3838F, 0.2847F, -0.1366F, 0.7531F));

		PartDefinition cube_r205 = Shoulders.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(29, 97).mirror().addBox(-5.548F, 4.564F, -0.4825F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4064F, -5.2017F, -5.3838F, 0.3114F, 0.0481F, 0.1694F));

		PartDefinition cube_r206 = Shoulders.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(97, 21).mirror().addBox(0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1064F, -4.4017F, -8.5838F, -0.1786F, -0.4061F, 1.958F));

		PartDefinition cube_r207 = Shoulders.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(38, 119).mirror().addBox(-1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1064F, -4.4017F, -8.5838F, 0.365F, -0.2299F, 0.721F));

		PartDefinition cube_r208 = Shoulders.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(56, 101).mirror().addBox(-5.548F, 4.564F, -0.4825F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1064F, -4.4017F, -8.5838F, 0.4284F, 0.0127F, 0.1555F));

		PartDefinition cube_r209 = Shoulders.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(59, 101).mirror().addBox(-5.548F, 4.564F, -0.4825F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6064F, -2.9017F, -10.6838F, 0.4952F, -0.0076F, 0.1731F));

		PartDefinition cube_r210 = Shoulders.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(88, 123).mirror().addBox(-1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6064F, -2.9017F, -10.6838F, 0.4124F, -0.2825F, 0.7265F));

		PartDefinition cube_r211 = Shoulders.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6064F, -2.9017F, -10.6838F, -0.2179F, -0.4662F, 1.992F));

		PartDefinition cube_r212 = Shoulders.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(53, 95).addBox(5.548F, 4.564F, -0.4825F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5064F, -5.9017F, -2.3838F, 0.2444F, -0.068F, -0.183F));

		PartDefinition cube_r213 = Shoulders.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(41, 119).addBox(1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5064F, -5.9017F, -2.3838F, 0.2398F, 0.0829F, -0.7755F));

		PartDefinition cube_r214 = Shoulders.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(93, 60).addBox(-0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5064F, -5.9017F, -2.3838F, -0.0797F, 0.2385F, -1.9614F));

		PartDefinition cube_r215 = Shoulders.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(22, 94).addBox(-0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4064F, -5.2017F, -5.3838F, -0.1144F, 0.2998F, -1.9532F));

		PartDefinition cube_r216 = Shoulders.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(85, 123).addBox(1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4064F, -5.2017F, -5.3838F, 0.2847F, 0.1366F, -0.7531F));

		PartDefinition cube_r217 = Shoulders.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(29, 97).addBox(5.548F, 4.564F, -0.4825F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4064F, -5.2017F, -5.3838F, 0.3114F, -0.0481F, -0.1694F));

		PartDefinition cube_r218 = Shoulders.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(97, 21).addBox(-0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1064F, -4.4017F, -8.5838F, -0.1786F, 0.4061F, -1.958F));

		PartDefinition cube_r219 = Shoulders.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(38, 119).addBox(1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1064F, -4.4017F, -8.5838F, 0.365F, 0.2299F, -0.721F));

		PartDefinition cube_r220 = Shoulders.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(56, 101).addBox(5.548F, 4.564F, -0.4825F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1064F, -4.4017F, -8.5838F, 0.4284F, -0.0127F, -0.1555F));

		PartDefinition cube_r221 = Shoulders.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 101).addBox(-0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6064F, -2.9017F, -10.6838F, -0.2179F, 0.4662F, -1.992F));

		PartDefinition cube_r222 = Shoulders.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(88, 123).addBox(1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6064F, -2.9017F, -10.6838F, 0.4124F, 0.2825F, -0.7265F));

		PartDefinition cube_r223 = Shoulders.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(59, 101).addBox(5.548F, 4.564F, -0.4825F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6064F, -2.9017F, -10.6838F, 0.4952F, 0.0076F, -0.1731F));

		PartDefinition cube_r224 = Shoulders.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(109, 107).addBox(-0.5F, -4.5379F, -0.7225F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3505F, -8.5028F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r225 = Shoulders.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(92, 33).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2725F, 14.8701F, -4.1886F, 0.6525F, -0.1547F, -1.0542F));

		PartDefinition cube_r226 = Shoulders.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(118, 106).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2725F, 14.8701F, -4.1886F, 0.6957F, -0.3597F, -1.2229F));

		PartDefinition cube_r227 = Shoulders.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(54, 118).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8725F, 14.3701F, -4.1886F, 0.7478F, -0.3714F, -1.2007F));

		PartDefinition cube_r228 = Shoulders.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8725F, 14.3701F, -4.1886F, 0.699F, -0.1747F, -1.021F));

		PartDefinition cube_r229 = Shoulders.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(50, 116).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0725F, 14.0701F, -4.1886F, 0.6929F, 0.039F, -0.9402F));

		PartDefinition cube_r230 = Shoulders.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 118).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0725F, 14.0701F, -4.1886F, 0.7034F, -0.1621F, -1.1086F));

		PartDefinition cube_r231 = Shoulders.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(9, 92).mirror().addBox(0.1784F, -0.7403F, -0.7308F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.2108F, 13.2149F, -4.9408F, 1.314F, -0.3797F, -0.2287F));

		PartDefinition cube_r232 = Shoulders.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(59, 116).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2725F, 13.7701F, -4.6886F, 0.8135F, -0.0902F, -1.0917F));

		PartDefinition cube_r233 = Shoulders.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 92).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2725F, 13.7701F, -4.6886F, 0.8135F, 0.0902F, -0.9017F));

		PartDefinition cube_r234 = Shoulders.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(95, 116).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9837F, 7.4429F, -11.5078F, -0.1742F, -0.0904F, -1.1776F));

		PartDefinition cube_r235 = Shoulders.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.4736F, 0.8767F, -5.6437F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 101).mirror().addBox(-0.4736F, -3.1233F, -3.6437F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0677F, 11.3716F, -8.8083F, 1.5441F, -0.5187F, -1.14F));

		PartDefinition cube_r236 = Shoulders.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(0.0F, -3.0181F, -6.8683F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 59).mirror().addBox(0.0F, -1.0181F, -1.8683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.1F, 5.2447F, -6.3112F, 1.1441F, -0.3056F, -0.2077F));

		PartDefinition cube_r237 = Shoulders.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(0.0F, -0.8143F, -3.5051F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-10.1F, 5.2447F, -6.3112F, 0.3413F, -0.3056F, -0.2077F));

		PartDefinition cube_r238 = Shoulders.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(86, 92).mirror().addBox(-1.0F, -1.0F, -1.3F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 92).addBox(18.2F, -1.0F, -1.3F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.1F, 3.9447F, -5.7112F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r239 = Shoulders.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(98, 2).mirror().addBox(-1.0F, -0.0877F, -0.1125F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(98, 2).addBox(18.2F, -0.0877F, -0.1125F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.1F, 4.1447F, -6.6112F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r240 = Shoulders.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(80, 92).addBox(-1.0F, -0.8143F, -3.5051F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(10.1F, 5.2447F, -6.3112F, 0.3413F, 0.3056F, 0.2077F));

		PartDefinition cube_r241 = Shoulders.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(118, 106).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2725F, 14.8701F, -4.1886F, 0.6957F, 0.3597F, 1.2229F));

		PartDefinition cube_r242 = Shoulders.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(92, 33).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2725F, 14.8701F, -4.1886F, 0.6525F, 0.1547F, 1.0542F));

		PartDefinition cube_r243 = Shoulders.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 56).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8725F, 14.3701F, -4.1886F, 0.699F, 0.1747F, 1.021F));

		PartDefinition cube_r244 = Shoulders.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(54, 118).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8725F, 14.3701F, -4.1886F, 0.7478F, 0.3714F, 1.2007F));

		PartDefinition cube_r245 = Shoulders.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(84, 118).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0725F, 14.0701F, -4.1886F, 0.7034F, 0.1621F, 1.1086F));

		PartDefinition cube_r246 = Shoulders.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(50, 116).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0725F, 14.0701F, -4.1886F, 0.6929F, -0.039F, 0.9402F));

		PartDefinition cube_r247 = Shoulders.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(14, 92).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2725F, 13.7701F, -4.6886F, 0.8135F, -0.0902F, 0.9017F));

		PartDefinition cube_r248 = Shoulders.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(59, 116).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2725F, 13.7701F, -4.6886F, 0.8135F, 0.0902F, 1.0917F));

		PartDefinition cube_r249 = Shoulders.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(9, 92).addBox(-0.1784F, -0.7403F, -0.7308F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2108F, 13.2149F, -4.9408F, 1.314F, 0.3797F, 0.2287F));

		PartDefinition cube_r250 = Shoulders.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5264F, 0.8767F, -5.6437F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 101).addBox(-0.5264F, -3.1233F, -3.6437F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0677F, 11.3716F, -8.8083F, 1.5441F, 0.5187F, 1.14F));

		PartDefinition cube_r251 = Shoulders.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(37, 72).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3879F, -12.2723F, 0.0583F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Shoulders.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(95, 116).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9837F, 7.4429F, -11.5078F, -0.1742F, 0.0904F, 1.1776F));

		PartDefinition cube_r253 = Shoulders.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(21, 53).addBox(-1.0F, -3.0181F, -6.8683F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(117, 59).addBox(-1.0F, -1.0181F, -1.8683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1F, 5.2447F, -6.3112F, 1.1441F, 0.3056F, 0.2077F));

		PartDefinition cube_r254 = Shoulders.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -9.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm = Shoulders.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.8412F, 12.8424F, -7.6629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftArm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(80, 83).addBox(-1.0F, -2.0532F, -0.503F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, 3.9952F, 0.0881F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftArm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 101).addBox(-0.9078F, 0.6633F, 1.2414F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9149F, 2.7702F, -3.2593F, 1.1346F, -0.2085F, 0.2274F));

		PartDefinition cube_r257 = leftArm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5999F, 5.0549F, -1.6085F, 1.5796F, -0.2085F, 0.2274F));

		PartDefinition cube_r258 = leftArm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 71).addBox(-1.0F, -1.9F, 2.9F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, 11.606F, -0.5234F, 1.5184F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 8.6489F, -0.5426F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftArm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(42, 12).addBox(-1.4F, -1.6333F, 1.8991F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(32, 100).addBox(-0.9F, -1.6333F, -2.9009F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.12F))
				.texOffs(80, 50).addBox(-1.6F, -0.1333F, -3.0009F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0333F, 4.0296F, -1.2954F, 1.5708F, 1.4835F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 6.9475F, -1.1938F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftArm3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(57, 84).addBox(-0.7F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2918F, 1.8175F, 0.7474F, 1.5708F, 0.0F, 0.6545F));

		PartDefinition cube_r261 = leftArm3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(105, 73).addBox(-3.9041F, -18.3838F, -86.8862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(93, 60).addBox(-7.4041F, -19.3838F, -86.8862F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5771F, -82.8476F, 18.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftArm3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(74, 83).addBox(-8.4041F, -17.3838F, -86.8862F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0771F, -82.8476F, 17.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightArm = Shoulders.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.8412F, 12.8424F, -7.6629F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightArm.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(61, 83).addBox(-2.0F, -2.0532F, -0.503F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, 3.9952F, 0.0881F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightArm.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(101, 42).addBox(-0.0922F, 0.6633F, 1.2414F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9149F, 2.7702F, -3.2593F, 1.1346F, 0.2085F, -0.2274F));

		PartDefinition cube_r265 = rightArm.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(30, 88).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5999F, 5.0549F, -1.6085F, 1.5796F, 0.2085F, -0.2274F));

		PartDefinition cube_r266 = rightArm.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(45, 87).addBox(-2.0F, -1.9F, 2.9F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, 11.606F, -0.5234F, 1.5184F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 8.6489F, -0.5426F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r267 = rightArm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(22, 25).addBox(-0.6F, -1.6333F, 1.8991F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(12, 82).addBox(-0.1F, -1.6333F, -2.9009F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.12F))
				.texOffs(78, 40).addBox(-0.4F, -0.1333F, -3.0009F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, 4.0296F, -1.2954F, 1.5708F, -1.4835F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 6.9475F, -1.1938F, 0.0868F, -0.0063F, 0.0006F));

		PartDefinition cube_r268 = rightArm3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 62).addBox(-0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2918F, 1.8175F, 0.7474F, 1.5708F, 0.0F, -0.6545F));

		PartDefinition cube_r269 = rightArm3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(41, 105).addBox(2.9041F, -18.3838F, -86.8862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(40, 44).addBox(3.4041F, -19.3838F, -86.8862F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5771F, -82.8476F, 18.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r270 = rightArm3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(59, 73).addBox(7.4041F, -17.3838F, -86.8862F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0771F, -82.8476F, 17.6202F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Neck4 = Shoulders.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -8.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r271 = Neck4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(64, 44).addBox(-0.5F, 0.1238F, -3.0383F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Neck4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.29F, -3.9674F, -1.2258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 0).addBox(0.29F, -3.9674F, -1.2258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2495F, -1.6028F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Neck4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(68, 133).mirror().addBox(-0.29F, -5.9306F, 0.0719F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 133).addBox(0.29F, -5.9306F, 0.0719F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2495F, -1.6028F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Neck4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(82, 122).mirror().addBox(-0.4F, -8.5141F, 2.1753F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 122).addBox(0.4F, -8.5141F, 2.1753F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2495F, -1.6028F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Neck4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(26, 123).mirror().addBox(0.8699F, -5.5247F, -0.6096F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4495F, -1.4028F, 0.496F, 0.4177F, -0.6433F));

		PartDefinition cube_r276 = Neck4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(65, 92).mirror().addBox(0.01F, -0.3646F, -0.6338F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 92).addBox(0.59F, -0.3646F, -0.6338F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -3.5095F, -6.4911F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Neck4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(91, 121).mirror().addBox(0.0F, -4.8601F, -0.6944F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 121).addBox(0.6F, -4.8601F, -0.6944F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -3.0095F, -5.1911F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Neck4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(29, 53).mirror().addBox(-1.6327F, -0.8388F, -0.5111F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9124F, -2.0442F, -5.2118F, 1.9436F, -0.6763F, 0.4019F));

		PartDefinition cube_r279 = Neck4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(46, 131).mirror().addBox(0.01F, -1.7646F, -0.5338F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 131).addBox(0.59F, -1.7646F, -0.5338F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.5095F, -8.1911F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Neck4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(0.0F, -2.7145F, -0.3348F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 0).addBox(0.6F, -2.7145F, -0.3348F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.5095F, -8.1911F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Neck4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(6, 62).mirror().addBox(-0.8327F, -0.7388F, -0.5111F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9124F, -1.0442F, -6.9118F, 1.9436F, -0.6763F, 0.4019F));

		PartDefinition cube_r282 = Neck4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-1.6582F, -0.3424F, -0.2361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9124F, 0.9558F, -8.7118F, 1.7054F, 0.3738F, -1.3034F));

		PartDefinition cube_r283 = Neck4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(123, 86).mirror().addBox(-0.5F, -1.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8248F, 2.9163F, -6.8993F, 1.0571F, -0.2583F, -0.0106F));

		PartDefinition cube_r284 = Neck4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(107, 39).mirror().addBox(-0.3324F, -0.4103F, -0.2772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9124F, 0.9558F, -8.7118F, 1.7869F, 0.3305F, -0.9761F));

		PartDefinition cube_r285 = Neck4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(129, 4).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7176F, 0.1083F, -8.3654F, 2.5732F, -0.4528F, 0.2958F));

		PartDefinition cube_r286 = Neck4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(110, 123).mirror().addBox(0.6124F, -4.4641F, -0.5767F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 123).addBox(1.2124F, -4.4641F, -0.5767F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9124F, -0.5442F, -8.2118F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r287 = Neck4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(28, 129).mirror().addBox(0.6224F, -3.5884F, -0.3459F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 129).addBox(1.2024F, -3.5884F, -0.3459F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9124F, 0.0558F, -8.7118F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r288 = Neck4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6064F, -3.4017F, -3.9838F, -0.2596F, -0.5256F, 1.9595F));

		PartDefinition cube_r289 = Neck4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(23, 122).mirror().addBox(-1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6064F, -3.4017F, -3.9838F, 0.4612F, -0.3346F, 0.6593F));

		PartDefinition cube_r290 = Neck4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(17, 106).mirror().addBox(-5.548F, 4.564F, -0.4825F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6064F, -3.4017F, -3.9838F, 0.562F, -0.0279F, 0.1196F));

		PartDefinition cube_r291 = Neck4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(42, 133).mirror().addBox(0.2022F, -0.8474F, -0.2701F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1064F, -1.7017F, -5.6838F, -0.3443F, -0.6356F, 2.1282F));

		PartDefinition cube_r292 = Neck4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(25, 129).mirror().addBox(-1.9008F, 0.9448F, -0.4798F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1064F, -1.7017F, -5.6838F, 0.5593F, -0.4287F, 0.7448F));

		PartDefinition cube_r293 = Neck4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(20, 106).mirror().addBox(-4.348F, 2.964F, -0.4825F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1064F, -1.7017F, -5.6838F, 0.688F, -0.0638F, 0.2359F));

		PartDefinition cube_r294 = Neck4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(47, 124).mirror().addBox(0.0223F, -0.0676F, -0.5313F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9064F, 1.6983F, -4.8838F, 1.0025F, -0.3972F, 0.1015F));

		PartDefinition cube_r295 = Neck4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(22, 130).mirror().addBox(-0.0785F, 0.0299F, -0.5246F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7064F, 0.0983F, -6.8838F, 0.7937F, -0.7844F, 0.4665F));

		PartDefinition cube_r296 = Neck4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(134, 3).mirror().addBox(0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2936F, 0.0983F, -6.4838F, -0.5784F, -0.9591F, 1.9959F));

		PartDefinition cube_r297 = Neck4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(47, 124).addBox(-0.0223F, -0.0676F, -0.5313F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9064F, 1.6983F, -4.8838F, 1.0025F, 0.3972F, -0.1015F));

		PartDefinition cube_r298 = Neck4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(22, 130).addBox(0.0785F, 0.0299F, -0.5246F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7064F, 0.0983F, -6.8838F, 0.7937F, 0.7844F, -0.4665F));

		PartDefinition cube_r299 = Neck4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(134, 3).addBox(-0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2936F, 0.0983F, -6.4838F, -0.5784F, 0.9591F, -1.9959F));

		PartDefinition cube_r300 = Neck4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(20, 106).addBox(4.348F, 2.964F, -0.4825F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1064F, -1.7017F, -5.6838F, 0.688F, 0.0638F, -0.2359F));

		PartDefinition cube_r301 = Neck4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(25, 129).addBox(1.9008F, 0.9448F, -0.4798F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1064F, -1.7017F, -5.6838F, 0.5593F, 0.4287F, -0.7448F));

		PartDefinition cube_r302 = Neck4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(42, 133).addBox(-0.2022F, -0.8474F, -0.2701F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1064F, -1.7017F, -5.6838F, -0.3443F, 0.6356F, -2.1282F));

		PartDefinition cube_r303 = Neck4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(17, 106).addBox(5.548F, 4.564F, -0.4825F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6064F, -3.4017F, -3.9838F, 0.562F, 0.0279F, -0.1196F));

		PartDefinition cube_r304 = Neck4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(23, 122).addBox(1.9008F, 0.9448F, -0.4798F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6064F, -3.4017F, -3.9838F, 0.4612F, 0.3346F, -0.6593F));

		PartDefinition cube_r305 = Neck4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(59, 73).addBox(-0.2022F, 0.1526F, -0.2701F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6064F, -3.4017F, -3.9838F, -0.2596F, 0.5256F, -1.9595F));

		PartDefinition cube_r306 = Neck4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(29, 53).addBox(-1.3673F, -0.8388F, -0.5111F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9124F, -2.0442F, -5.2118F, 1.9436F, 0.6763F, -0.4019F));

		PartDefinition cube_r307 = Neck4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(88, 114).addBox(-0.5F, -2.1F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.1662F, -4.1285F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r308 = Neck4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(114, 113).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.1662F, -5.8285F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r309 = Neck4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(6, 62).addBox(-1.1673F, -0.7388F, -0.5111F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9124F, -1.0442F, -6.9118F, 1.9436F, 0.6763F, -0.4019F));

		PartDefinition cube_r310 = Neck4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(123, 86).addBox(-0.5F, -1.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8248F, 2.9163F, -6.8993F, 1.0571F, 0.2583F, 0.0106F));

		PartDefinition cube_r311 = Neck4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(107, 39).addBox(-0.6676F, -0.4103F, -0.2772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9124F, 0.9558F, -8.7118F, 1.7869F, -0.3305F, 0.9761F));

		PartDefinition cube_r312 = Neck4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(78, 44).addBox(-0.3418F, -0.3424F, -0.2361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9124F, 0.9558F, -8.7118F, 1.7054F, -0.3738F, 1.3034F));

		PartDefinition cube_r313 = Neck4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(66, 116).addBox(-1.4124F, -0.9278F, -0.5068F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9124F, 0.9558F, -8.7118F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r314 = Neck4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(30, 64).addBox(-0.5673F, -1.1388F, -0.5111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9124F, 0.9558F, -8.7118F, 1.8662F, 0.2216F, -0.5752F));

		PartDefinition cube_r315 = Neck4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(129, 4).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7176F, 0.1083F, -8.3654F, 2.5732F, 0.4528F, -0.2958F));

		PartDefinition cube_r316 = Neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(26, 123).addBox(-1.8699F, -5.5247F, -0.6096F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4495F, -1.4028F, 0.496F, -0.4177F, 0.6433F));

		PartDefinition cube_r317 = Neck4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(112, 22).addBox(-0.5F, -4.4526F, -0.7748F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2495F, -1.6028F, 0.637F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(31, 12).addBox(-0.5F, -3.472F, -8.7186F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(80, 116).addBox(-0.5F, -2.472F, -6.7186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(116, 74).addBox(-0.5F, -2.472F, -4.6186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(73, 116).addBox(-0.5F, -2.472F, -2.6186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.5F, -8.5F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r318 = Neck3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(23, 72).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5374F, -8.657F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r319 = Neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(7, 101).mirror().addBox(0.01F, -1.0178F, -1.2281F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 101).addBox(0.59F, -1.0178F, -1.2281F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.9568F, -1.3908F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r320 = Neck3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(21, 118).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.2357F, -1.7734F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r321 = Neck3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(124, 11).mirror().addBox(0.0F, -4.2818F, -0.8276F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 11).addBox(0.6F, -4.2818F, -0.8276F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.9568F, -1.3908F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r322 = Neck3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(128, 28).mirror().addBox(0.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -1.9357F, -1.9734F, 1.7425F, -0.3088F, 0.4444F));

		PartDefinition cube_r323 = Neck3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(108, 80).mirror().addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -1.974F, -1.9221F, 1.5708F, 0.0F, -1.0123F));

		PartDefinition cube_r324 = Neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(23, 78).mirror().addBox(-1.6F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4336F, -0.5838F, -1.7697F, 1.6041F, -0.0062F, -1.3223F));

		PartDefinition cube_r325 = Neck3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(126, 81).mirror().addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.016F, -0.0242F, -1.8152F, 1.5708F, 0.0F, -0.0785F));

		PartDefinition cube_r326 = Neck3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(48, 95).mirror().addBox(-0.5F, -0.4F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7258F, 0.3069F, -1.9533F, 1.3326F, -0.1345F, -0.0487F));

		PartDefinition cube_r327 = Neck3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(126, 118).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.016F, -0.0242F, -4.2152F, 1.5708F, 0.0F, -0.0785F));

		PartDefinition cube_r328 = Neck3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(50, 125).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7258F, 0.3069F, -3.9533F, 1.3326F, -0.1345F, -0.0487F));

		PartDefinition cube_r329 = Neck3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(124, 59).mirror().addBox(-1.5014F, 1.4196F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.9357F, -6.1734F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r330 = Neck3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(117, 133).mirror().addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -1.974F, -4.3221F, 1.5708F, 0.0F, -1.0123F));

		PartDefinition cube_r331 = Neck3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(131, 10).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.2357F, -3.7734F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r332 = Neck3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(128, 65).mirror().addBox(0.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -1.9357F, -3.9734F, 1.8298F, -0.3088F, 0.4444F));

		PartDefinition cube_r333 = Neck3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(101, 42).mirror().addBox(0.01F, -0.4269F, -0.1415F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 42).addBox(0.59F, -0.4269F, -0.1415F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -3.2568F, -4.5908F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r334 = Neck3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(7, 110).mirror().addBox(0.0F, -3.5407F, -1.0061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 110).addBox(0.6F, -3.5407F, -1.0061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -3.2568F, -3.3908F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r335 = Neck3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(104, 116).mirror().addBox(0.01F, -1.2704F, -0.8561F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 116).addBox(0.59F, -1.2704F, -0.8561F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.2568F, -5.5908F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r336 = Neck3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(38, 58).mirror().addBox(0.0F, -4.185F, -0.3309F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 58).addBox(0.6F, -4.185F, -0.3309F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.2568F, -5.5908F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r337 = Neck3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(131, 73).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.2357F, -5.8734F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r338 = Neck3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(128, 69).mirror().addBox(0.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -1.9357F, -6.0734F, 1.917F, -0.3088F, 0.4444F));

		PartDefinition cube_r339 = Neck3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(133, 130).mirror().addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -1.974F, -6.4221F, 1.5708F, 0.0F, -1.0123F));

		PartDefinition cube_r340 = Neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(124, 110).mirror().addBox(-1.5014F, 1.4196F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(124, 99).mirror().addBox(-1.5014F, -0.6804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.9357F, -8.2734F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r341 = Neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(119, 126).mirror().addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.016F, -0.0242F, -6.3152F, 1.5708F, 0.0F, -0.0785F));

		PartDefinition cube_r342 = Neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(126, 125).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7258F, 0.3069F, -6.0533F, 1.3326F, -0.1345F, -0.0487F));

		PartDefinition cube_r343 = Neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(117, 64).mirror().addBox(-1.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.016F, -0.0242F, -8.4152F, 1.5708F, 0.0F, -0.0785F));

		PartDefinition cube_r344 = Neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(128, 84).mirror().addBox(0.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -1.9357F, -8.1734F, 1.917F, -0.3088F, 0.4444F));

		PartDefinition cube_r345 = Neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(128, 53).mirror().addBox(0.01F, 0.0351F, -0.3436F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 53).addBox(0.59F, 0.0351F, -0.3436F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -6.1568F, -9.7908F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(69, 127).mirror().addBox(0.0F, -3.4407F, -1.0061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 127).addBox(0.6F, -3.4407F, -1.0061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -3.7568F, -7.1908F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(95, 131).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.2357F, -7.9734F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r348 = Neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(132, 133).mirror().addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -1.974F, -8.5221F, 1.5708F, 0.0F, -1.0123F));

		PartDefinition cube_r349 = Neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(131, 18).mirror().addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7554F, -0.5136F, -8.2301F, 1.4199F, -0.1345F, -0.0487F));

		PartDefinition cube_r350 = Neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(128, 28).addBox(-1.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -1.9357F, -1.9734F, 1.7425F, 0.3088F, -0.4444F));

		PartDefinition cube_r351 = Neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(21, 118).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.2357F, -1.7734F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r352 = Neck3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(108, 80).addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9066F, -1.974F, -1.9221F, 1.5708F, 0.0F, 1.0123F));

		PartDefinition cube_r353 = Neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(48, 95).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7258F, 0.3069F, -1.9533F, 1.3326F, 0.1345F, 0.0487F));

		PartDefinition cube_r354 = Neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(23, 78).addBox(-1.4F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4336F, -0.5838F, -1.7697F, 1.6041F, 0.0062F, 1.3223F));

		PartDefinition cube_r355 = Neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(126, 81).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.016F, -0.0242F, -1.8152F, 1.5708F, 0.0F, 0.0785F));

		PartDefinition cube_r356 = Neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(131, 10).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.2357F, -3.7734F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r357 = Neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(126, 118).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.016F, -0.0242F, -4.2152F, 1.5708F, 0.0F, 0.0785F));

		PartDefinition cube_r358 = Neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(50, 125).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7258F, 0.3069F, -3.9533F, 1.3326F, 0.1345F, 0.0487F));

		PartDefinition cube_r359 = Neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(124, 59).addBox(-0.4986F, 1.4196F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.9357F, -6.1734F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r360 = Neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(117, 133).addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9066F, -1.974F, -4.3221F, 1.5708F, 0.0F, 1.0123F));

		PartDefinition cube_r361 = Neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(128, 65).addBox(-1.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -1.9357F, -3.9734F, 1.8298F, 0.3088F, -0.4444F));

		PartDefinition cube_r362 = Neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(119, 126).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.016F, -0.0242F, -6.3152F, 1.5708F, 0.0F, 0.0785F));

		PartDefinition cube_r363 = Neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(126, 125).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7258F, 0.3069F, -6.0533F, 1.3326F, 0.1345F, 0.0487F));

		PartDefinition cube_r364 = Neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(131, 73).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.2357F, -5.8734F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r365 = Neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(128, 69).addBox(-1.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -1.9357F, -6.0734F, 1.917F, 0.3088F, -0.4444F));

		PartDefinition cube_r366 = Neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(133, 130).addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9066F, -1.974F, -6.4221F, 1.5708F, 0.0F, 1.0123F));

		PartDefinition cube_r367 = Neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(128, 84).addBox(-1.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -1.9357F, -8.1734F, 1.917F, 0.3088F, -0.4444F));

		PartDefinition cube_r368 = Neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(95, 131).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.2357F, -7.9734F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r369 = Neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(132, 133).addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9066F, -1.974F, -8.5221F, 1.5708F, 0.0F, 1.0123F));

		PartDefinition cube_r370 = Neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(124, 99).addBox(-0.4986F, -0.6804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(124, 110).addBox(-0.4986F, 1.4196F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.9357F, -8.2734F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r371 = Neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(117, 64).addBox(-2.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.016F, -0.0242F, -8.4152F, 1.5708F, 0.0F, 0.0785F));

		PartDefinition cube_r372 = Neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(131, 18).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7554F, -0.5136F, -8.2301F, 1.4199F, 0.1345F, 0.0487F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(81, 59).addBox(-0.5F, -0.5106F, -7.5217F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(31, 116).addBox(-0.5F, -2.4106F, -4.2217F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(118, 90).addBox(-0.5F, -1.4106F, -6.8217F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 34).addBox(-0.5F, -2.4106F, -1.7217F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.9374F, -8.957F, -0.0894F, -0.2173F, 0.0193F));

		PartDefinition cube_r373 = Neck2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(131, 32).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7554F, 0.5478F, -1.2332F, 1.4199F, -0.1345F, -0.0487F));

		PartDefinition cube_r374 = Neck2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(125, 92).mirror().addBox(-1.2595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -1.2765F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r375 = Neck2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(131, 99).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -1.2765F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r376 = Neck2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -0.9126F, -1.5252F, 1.5708F, 0.0F, -1.0123F));

		PartDefinition cube_r377 = Neck2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(131, 109).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.7743F, -0.9765F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r378 = Neck2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(128, 88).mirror().addBox(0.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -1.4743F, -1.1765F, 1.917F, -0.3088F, 0.4444F));

		PartDefinition cube_r379 = Neck2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(36, 130).mirror().addBox(0.01F, 0.0351F, -0.3436F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 130).addBox(0.59F, 0.0351F, -0.3436F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.0954F, -2.7939F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Neck2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(107, 123).mirror().addBox(0.0F, -3.4407F, -1.0061F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 123).addBox(0.6F, -3.4407F, -1.0061F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.6954F, -0.1939F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Neck2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(89, 92).mirror().addBox(0.0F, -2.1642F, -0.0368F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 92).addBox(0.6F, -2.1642F, -0.0368F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.7954F, -4.0939F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Neck2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(131, 14).mirror().addBox(0.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -1.4743F, -3.6765F, 1.917F, -0.3088F, 0.4444F));

		PartDefinition cube_r383 = Neck2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.7743F, -3.4765F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r384 = Neck2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(113, 124).mirror().addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -0.9126F, -4.0252F, 1.5708F, 0.0F, -1.0123F));

		PartDefinition cube_r385 = Neck2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(100, 125).mirror().addBox(-1.2595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -3.7765F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r386 = Neck2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(133, 112).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -3.7765F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r387 = Neck2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(131, 49).mirror().addBox(-1.3961F, -1.1468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -3.4765F, 1.5944F, -0.1345F, -0.0487F));

		PartDefinition cube_r388 = Neck2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(3, 126).mirror().addBox(-1.2595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -6.0765F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r389 = Neck2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(131, 53).mirror().addBox(-1.3961F, -0.6468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -6.0765F, 1.5944F, -0.1345F, -0.0487F));

		PartDefinition cube_r390 = Neck2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(113, 131).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -6.0765F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r391 = Neck2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(131, 127).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -6.0765F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r392 = Neck2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(131, 124).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.1257F, -6.0765F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r393 = Neck2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(129, 24).mirror().addBox(0.0281F, -0.0601F, -0.0609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -0.5743F, -6.2765F, 2.1025F, -0.3907F, 0.4124F));

		PartDefinition cube_r394 = Neck2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(18, 131).mirror().addBox(-0.3F, -2.6F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 131).addBox(0.3F, -2.6F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6723F, -5.659F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r395 = Neck2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(134, 36).mirror().addBox(-0.3F, -0.0432F, -0.007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 36).addBox(0.3F, -0.0432F, -0.007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2723F, -6.159F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r396 = Neck2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(131, 109).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.7743F, -0.9765F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r397 = Neck2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(128, 88).addBox(-1.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -1.4743F, -1.1765F, 1.917F, 0.3088F, -0.4444F));

		PartDefinition cube_r398 = Neck2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(125, 92).addBox(-0.7405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -1.2765F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r399 = Neck2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(131, 99).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -1.2765F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r400 = Neck2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(131, 32).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7554F, 0.5478F, -1.2332F, 1.4199F, 0.1345F, 0.0487F));

		PartDefinition cube_r401 = Neck2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(125, 62).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9066F, -0.9126F, -1.5252F, 1.5708F, 0.0F, 1.0123F));

		PartDefinition cube_r402 = Neck2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(131, 49).addBox(0.3961F, -1.1468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -3.4765F, 1.5944F, 0.1345F, 0.0487F));

		PartDefinition cube_r403 = Neck2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(100, 125).addBox(-0.7405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -3.7765F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r404 = Neck2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(133, 112).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -3.7765F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r405 = Neck2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(113, 124).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9066F, -0.9126F, -4.0252F, 1.5708F, 0.0F, 1.0123F));

		PartDefinition cube_r406 = Neck2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(134, 0).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.7743F, -3.4765F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r407 = Neck2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(131, 14).addBox(-1.0281F, -0.3601F, -0.1609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -1.4743F, -3.6765F, 1.917F, 0.3088F, -0.4444F));

		PartDefinition cube_r408 = Neck2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(3, 126).addBox(-0.7405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -6.0765F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r409 = Neck2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(129, 24).addBox(-1.0281F, -0.0601F, -0.0609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -0.5743F, -6.2765F, 2.1025F, 0.3907F, -0.4124F));

		PartDefinition cube_r410 = Neck2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(131, 127).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -6.0765F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r411 = Neck2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(131, 124).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -6.0765F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r412 = Neck2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(113, 131).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -6.0765F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r413 = Neck2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(131, 53).addBox(0.3961F, -0.6468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.1257F, -6.0765F, 1.5944F, 0.1345F, 0.0487F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(65, 92).addBox(-0.5F, -0.693F, -3.8951F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1894F, -7.4217F, 0.2288F, -0.1275F, -0.0296F));

		PartDefinition cube_r414 = Neck1.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(54, 130).mirror().addBox(-1.3961F, -0.6468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -0.4118F, 1.4199F, -0.1345F, -0.0487F));

		PartDefinition cube_r415 = Neck1.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(31, 126).mirror().addBox(-1.2595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -0.4118F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r416 = Neck1.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(132, 41).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -0.4118F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r417 = Neck1.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(132, 61).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -0.4118F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r418 = Neck1.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(13, 43).mirror().addBox(-0.3F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 43).addBox(0.3F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8764F, 0.0057F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Neck1.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(31, 129).mirror().addBox(0.0281F, -0.0601F, -0.0609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, -0.7784F, -0.6118F, 2.0441F, -0.3133F, 0.4554F));

		PartDefinition cube_r420 = Neck1.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(132, 91).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -0.4118F, 1.5393F, 0.0F, 0.6119F));

		PartDefinition cube_r421 = Neck1.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(129, 37).mirror().addBox(-0.6156F, -1.285F, 0.3329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -2.5118F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r422 = Neck1.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(132, 106).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -2.5118F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r423 = Neck1.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(100, 132).mirror().addBox(-0.6014F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -2.5118F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r424 = Neck1.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(62, 126).mirror().addBox(-1.2595F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -2.5118F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r425 = Neck1.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(130, 56).mirror().addBox(-1.3961F, -0.6468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0784F, -2.5118F, 1.4199F, -0.1345F, -0.0487F));

		PartDefinition cube_r426 = Neck1.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(31, 129).addBox(-1.0281F, -0.0601F, -0.0609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2054F, -0.7784F, -0.6118F, 2.0441F, 0.3133F, -0.4554F));

		PartDefinition cube_r427 = Neck1.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(132, 91).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -0.4118F, 1.5393F, 0.0F, -0.6119F));

		PartDefinition cube_r428 = Neck1.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(132, 61).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -0.4118F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r429 = Neck1.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(132, 41).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -0.4118F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r430 = Neck1.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(55, 131).addBox(0.3961F, -0.6468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -0.4118F, 1.4199F, 0.1345F, 0.0487F));

		PartDefinition cube_r431 = Neck1.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(31, 126).addBox(-0.7405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -0.4118F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r432 = Neck1.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(129, 37).addBox(-0.3844F, -1.285F, 0.3329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -2.5118F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r433 = Neck1.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(86, 131).addBox(0.0F, -1.6865F, -0.9988F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2213F, -2.0313F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Neck1.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(132, 106).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -2.5118F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r435 = Neck1.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(100, 132).addBox(-0.3986F, -0.6804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -2.5118F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r436 = Neck1.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(131, 57).addBox(0.3961F, -0.6468F, -0.8769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -2.5118F, 1.4199F, 0.1345F, 0.0487F));

		PartDefinition cube_r437 = Neck1.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(62, 126).addBox(-0.7405F, -0.6418F, -0.7808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0784F, -2.5118F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.443F, -3.6951F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition cube_r438 = Head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(21, 43).addBox(-1.5F, -0.3548F, -1.8117F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.089F, -0.1569F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -3.6229F, 5.3441F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.811F, -7.6569F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(115, 35).addBox(-1.5F, -1.9745F, -0.7586F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.461F, -8.8569F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r441 = Head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(50, 84).addBox(-1.5F, -1.0157F, -0.7011F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.961F, -8.0569F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(92, 53).addBox(-1.5F, -0.9706F, -0.7277F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.161F, -7.3569F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 25).addBox(-1.5F, -1.1706F, -1.7277F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.161F, -7.3569F, -0.6458F, 0.0F, 0.0F));

		PartDefinition LIP_r1 = Head.addOrReplaceChild("LIP_r1", CubeListBuilder.create().texOffs(78, 50).addBox(-1.5F, -0.9451F, 0.17F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1245F, -8.8197F, -0.1134F, 0.0F, 0.0F));

		PartDefinition LIP_r2 = Head.addOrReplaceChild("LIP_r2", CubeListBuilder.create().texOffs(116, 101).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5245F, -9.0197F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(99, 67).addBox(-1.5F, -1.8282F, 3.9877F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(97, 21).addBox(-1.0F, -1.8282F, 0.6877F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.811F, -7.6569F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(100, 33).addBox(-2.0F, -1.9477F, -0.4391F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.611F, -4.9569F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(38, 53).addBox(-2.0F, -1.8534F, -2.6609F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.411F, -4.2569F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(121, 82).mirror().addBox(0.0F, -2.6F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(122, 25).mirror().addBox(0.0F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(121, 82).addBox(3.4F, -2.6F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F))
				.texOffs(122, 25).addBox(3.4F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.2F, 0.5445F, -1.2554F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r448 = Head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(132, 120).mirror().addBox(-0.5F, -0.8794F, -0.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.161F)).mirror(false)
				.texOffs(132, 120).addBox(2.9F, -0.8794F, -0.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.161F)), PartPose.offsetAndRotation(-1.7F, -0.2107F, -3.028F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(3, 133).mirror().addBox(-0.5F, -0.8156F, -0.1362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(3, 133).addBox(2.9F, -0.8156F, -0.1362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.7F, 0.2893F, -3.228F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r450 = Head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(133, 7).mirror().addBox(-0.5F, -0.1054F, -0.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.161F)).mirror(false)
				.texOffs(133, 7).addBox(2.9F, -0.1054F, -0.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.161F)), PartPose.offsetAndRotation(-1.7F, -0.2107F, -0.928F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(129, 77).mirror().addBox(-0.5F, -1.6917F, -0.7644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(129, 77).addBox(2.9F, -1.6917F, -0.7644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.7F, 0.7893F, -2.828F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r452 = Head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(133, 22).mirror().addBox(-0.5F, -0.1114F, -0.7692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(133, 22).addBox(2.9F, -0.1114F, -0.7692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.7F, -0.9107F, -0.928F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -1.9F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(53, 0).addBox(2.9F, -1.9F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7F, -0.0879F, -2.558F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(132, 116).mirror().addBox(-0.5F, -0.8687F, -0.1727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(132, 116).addBox(2.9F, -0.8687F, -0.1727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.7F, -1.2107F, -2.228F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(133, 94).mirror().addBox(-0.5F, -0.909F, -0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(133, 94).addBox(2.9F, -0.909F, -0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.7F, -0.8107F, -2.728F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(31, 133).mirror().addBox(-2.7F, -1.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 27).mirror().addBox(-2.9F, -1.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(133, 27).addBox(0.7F, -1.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(31, 133).addBox(0.5F, -1.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 53).addBox(-2.6F, -0.5F, -1.3F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0236F, -2.4814F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3468F, -2.1331F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(133, 44).mirror().addBox(-2.5F, -0.0198F, 0.0683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(133, 44).addBox(1.5F, -0.0198F, 0.0683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4288F, -0.5777F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(122, 77).mirror().addBox(-2.5F, -0.0007F, -2.0298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(122, 77).addBox(1.5F, -0.0007F, -2.0298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4288F, -0.4777F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(122, 37).mirror().addBox(-2.5F, -1.0205F, -2.0243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(122, 37).addBox(1.5F, -1.0205F, -2.0243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.5712F, -0.6777F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(133, 64).mirror().addBox(-2.0F, -0.9418F, -0.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(133, 64).addBox(1.0F, -0.9418F, -0.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9403F, -4.6988F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(-2.0F, 0.4492F, -2.7937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(112, 92).mirror().addBox(-2.0F, -0.0508F, -3.2937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(112, 30).addBox(1.0F, 0.4492F, -2.7937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(112, 92).addBox(1.0F, -0.0508F, -3.2937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7805F, -2.0845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(123, 30).mirror().addBox(-2.0F, -0.4295F, -1.49F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(99, 73).addBox(-1.5F, -0.4295F, -2.49F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(123, 30).addBox(1.0F, -0.4295F, -1.49F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0403F, -4.9988F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r463 = Jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(82, 70).addBox(-1.5F, 0.0189F, -0.1942F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.019F))
				.texOffs(133, 67).addBox(0.5F, 0.0189F, 0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(0.0F, 0.2403F, -7.2988F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(114, 97).addBox(-1.0F, -0.0791F, 0.0523F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.9597F, -7.3988F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(127, 106).mirror().addBox(-0.871F, 0.0705F, 2.6705F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3252F, -3.2542F, 0.2909F, -0.0133F, 0.0906F));

		PartDefinition cube_r466 = Jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(100, 116).mirror().addBox(0.0F, -0.9582F, 0.0143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3252F, -3.2542F, -0.0436F, -0.3054F, 0.0F));

		PartDefinition cube_r467 = Jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(127, 106).addBox(0.871F, 0.0705F, 2.6705F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3252F, -3.2542F, 0.2909F, 0.0133F, -0.0906F));

		PartDefinition cube_r468 = Jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(100, 116).addBox(0.0F, -0.9582F, 0.0143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3252F, -3.2542F, -0.0436F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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