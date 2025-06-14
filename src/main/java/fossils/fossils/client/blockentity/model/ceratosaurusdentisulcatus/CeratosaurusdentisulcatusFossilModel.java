package fossils.fossils.client.blockentity.model.ceratosaurusdentisulcatus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CeratosaurusdentisulcatusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Lowerjaw;
	private final ModelPart Throat;
	private final ModelPart Masseter;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;

	public CeratosaurusdentisulcatusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Throat = this.Lowerjaw.getChild("Throat");
		this.Masseter = this.Lowerjaw.getChild("Masseter");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offset(0.0F, -28.0F, 0.0F));

		PartDefinition Osteoderm_r1 = Hips.addOrReplaceChild("Osteoderm_r1", CubeListBuilder.create().texOffs(105, 66).addBox(0.0F, 0.386F, -0.4402F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2863F, 9.3692F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r2 = Hips.addOrReplaceChild("Osteoderm_r2", CubeListBuilder.create().texOffs(105, 18).addBox(0.0F, 4.3207F, 4.2891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 56).addBox(0.0F, 3.0777F, 2.9719F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.271F, 1.3132F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r3 = Hips.addOrReplaceChild("Osteoderm_r3", CubeListBuilder.create().texOffs(105, 8).addBox(0.0F, 2.0348F, 1.8753F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 104).addBox(0.0F, 0.9122F, 0.7179F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 69).addBox(0.0F, -0.2706F, -0.3996F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 105).addBox(0.0F, -1.3932F, -1.5571F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 105).addBox(0.0F, -2.555F, -2.8144F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.571F, 1.3132F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Hips.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(70, 83).addBox(0.0F, -4.9616F, 33.418F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 29).addBox(0.0F, -5.193F, 23.6164F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(48, 103).addBox(0.0F, -4.7839F, 21.6273F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6695F, -27.7439F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r4 = Hips.addOrReplaceChild("Osteoderm_r4", CubeListBuilder.create().texOffs(33, 104).addBox(0.0F, -3.6777F, -3.9719F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.371F, 1.3132F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(0.9261F, 6.5777F, -10.4185F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, 0.1023F, -0.0226F, 0.0861F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-0.1665F, 4.9984F, -3.8781F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.48F, 0.0F, -0.0785F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(29, 17).mirror().addBox(0.0153F, -3.6635F, -4.689F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.7418F, 0.0F, -0.1309F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(17, 29).mirror().addBox(-0.1665F, -2.1559F, -4.3265F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.3927F, 0.0F, -0.0785F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(93, 81).mirror().addBox(0.9764F, 5.8553F, 3.3212F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, 0.3683F, -0.0886F, 0.0062F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(65, 91).mirror().addBox(-0.1138F, -0.5072F, 2.4161F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, 0.7133F, 0.0207F, -0.1299F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.9251F, -5.7609F, 1.1884F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, 0.0262F, 0.0F, 0.0087F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(76, 48).mirror().addBox(-0.9251F, -6.0561F, -2.55F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.1484F, 0.0F, 0.0087F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(30, 32).mirror().addBox(-1.9478F, -7.3628F, 2.1664F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.1496F, -0.0086F, 0.2269F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-2.3768F, -9.5267F, -1.1573F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.1662F, 0.121F, 0.2279F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-1.9478F, -9.7037F, -0.9055F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.4812F, -0.0086F, 0.2269F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(-2.4464F, -7.0123F, 3.0115F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, 1.3697F, 0.121F, 0.2279F));

		PartDefinition Hips_r13 = Hips.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-2.4464F, -9.8257F, -1.016F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, 0.4621F, 0.121F, 0.2279F));

		PartDefinition Hips_r14 = Hips.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-2.3768F, -9.587F, -2.9874F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.044F, 0.121F, 0.2279F));

		PartDefinition Hips_r15 = Hips.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(43, 61).mirror().addBox(-2.3768F, -7.2893F, -3.9176F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1705F, 4.5416F, -0.4777F, -0.1313F, 0.121F, 0.2279F));

		PartDefinition Hips_r16 = Hips.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(11, 61).addBox(0.9478F, -9.7037F, -0.9055F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.4812F, 0.0086F, -0.2269F));

		PartDefinition Hips_r17 = Hips.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(58, 79).addBox(1.4464F, -7.0123F, 3.0115F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, 1.3697F, -0.121F, -0.2279F));

		PartDefinition Hips_r18 = Hips.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(19, 0).addBox(1.4464F, -9.8257F, -1.016F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, 0.4621F, -0.121F, -0.2279F));

		PartDefinition Hips_r19 = Hips.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(91, 0).addBox(1.3768F, -9.5267F, -1.1573F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.1662F, -0.121F, -0.2279F));

		PartDefinition Hips_r20 = Hips.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(90, 21).addBox(1.3768F, -9.587F, -2.9874F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.044F, -0.121F, -0.2279F));

		PartDefinition Hips_r21 = Hips.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(76, 9).addBox(-1.9261F, 6.5777F, -10.4185F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, 0.1023F, 0.0226F, -0.0861F));

		PartDefinition Hips_r22 = Hips.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(58, 89).addBox(-0.8335F, 4.9984F, -3.8781F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.48F, 0.0F, 0.0785F));

		PartDefinition Hips_r23 = Hips.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(29, 17).addBox(-1.0153F, -3.6635F, -4.689F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.7418F, 0.0F, 0.1309F));

		PartDefinition Hips_r24 = Hips.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(17, 29).addBox(-0.8335F, -2.1559F, -4.3265F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.3927F, 0.0F, 0.0785F));

		PartDefinition Hips_r25 = Hips.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(93, 81).addBox(-1.9764F, 5.8553F, 3.3212F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, 0.3683F, 0.0886F, -0.0062F));

		PartDefinition Hips_r26 = Hips.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(65, 91).addBox(-0.8862F, -0.5072F, 2.4161F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, 0.7133F, -0.0207F, 0.1299F));

		PartDefinition Hips_r27 = Hips.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(0, 17).addBox(-0.0749F, -5.7609F, 1.1884F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, 0.0262F, 0.0F, -0.0087F));

		PartDefinition Hips_r28 = Hips.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(76, 48).addBox(-0.0749F, -6.0561F, -2.55F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.1484F, 0.0F, -0.0087F));

		PartDefinition Hips_r29 = Hips.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(30, 32).addBox(0.9478F, -7.3628F, 2.1664F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.1496F, 0.0086F, -0.2269F));

		PartDefinition Hips_r30 = Hips.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(43, 61).addBox(1.3768F, -7.2893F, -3.9176F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1705F, 4.5416F, -0.4777F, -0.1313F, -0.121F, -0.2279F));

		PartDefinition Hips_r31 = Hips.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, 0.6958F, -0.0795F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -3.3094F, -6.2303F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1971F, -5.7691F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Osteoderm_r5 = Bodymiddle.addOrReplaceChild("Osteoderm_r5", CubeListBuilder.create().texOffs(105, 53).addBox(0.0F, 0.9007F, 0.224F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4891F, -0.8617F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r6 = Bodymiddle.addOrReplaceChild("Osteoderm_r6", CubeListBuilder.create().texOffs(104, 35).addBox(0.0F, -0.4775F, -1.0839F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5891F, -0.8617F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r7 = Bodymiddle.addOrReplaceChild("Osteoderm_r7", CubeListBuilder.create().texOffs(15, 104).addBox(0.0F, 0.6831F, 0.0175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 104).addBox(0.0F, -0.8402F, -1.428F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7891F, -4.5617F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Bodymiddle.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(70, 91).addBox(0.0F, -1.4F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9555F, -2.5317F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Neckfront_r3 = Bodymiddle.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(67, 101).addBox(0.0F, -1.5F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0427F, -4.5298F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Bodymiddle.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(42, 103).addBox(0.0F, -2.641F, 15.7294F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 103).addBox(0.0F, -2.6933F, 13.7301F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 58).addBox(0.0F, -2.8457F, 11.7282F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 103).addBox(0.0F, -2.4981F, 9.7262F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2724F, -22.7748F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodymiddle.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(14, 82).mirror().addBox(-2.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6132F, -2.572F, 0.1782F, 0.0751F, -0.8404F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(86, 2).mirror().addBox(-4.1897F, -2.3097F, -0.4222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6132F, -2.572F, 0.0933F, 0.1436F, -1.6704F));

		PartDefinition Bodyfront_r3 = Bodymiddle.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-3.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6132F, -2.572F, 0.1452F, 0.0908F, -1.2342F));

		PartDefinition Bodyfront_r4 = Bodymiddle.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(25, 63).mirror().addBox(-6.1897F, -2.3097F, -0.4222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7005F, -4.5701F, 0.1527F, 0.2928F, -1.4984F));

		PartDefinition Bodyfront_r5 = Bodymiddle.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(43, 88).mirror().addBox(-3.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7005F, -4.5701F, 0.2621F, 0.2014F, -1.0579F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(18, 72).mirror().addBox(-2.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7005F, -4.5701F, 0.3283F, 0.1329F, -0.6656F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-2.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7877F, -6.5682F, 0.4186F, 0.1509F, -0.6319F));

		PartDefinition Bodyfront_r8 = Bodymiddle.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-3.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7877F, -6.5682F, 0.34F, 0.2521F, -1.0195F));

		PartDefinition Bodyfront_r9 = Bodymiddle.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(20, 61).mirror().addBox(-8.1897F, -2.3097F, -0.4222F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7877F, -6.5682F, 0.2023F, 0.371F, -1.4612F));

		PartDefinition Bodyfront_r10 = Bodymiddle.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-11.0937F, -2.3347F, -0.4101F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.775F, -8.5707F, 0.2309F, 0.4175F, -1.4171F));

		PartDefinition Bodyfront_r11 = Bodymiddle.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(-3.7905F, -0.8085F, -0.4101F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.775F, -8.5707F, 0.3853F, 0.2829F, -0.9744F));

		PartDefinition Bodyfront_r12 = Bodymiddle.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(83, 48).mirror().addBox(-1.9655F, -0.067F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.775F, -8.5707F, 0.4714F, 0.163F, -0.5906F));

		PartDefinition Bodyfront_r13 = Bodymiddle.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(29, 23).mirror().addBox(-2.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9622F, -10.5644F, 0.505F, 0.1741F, -0.5674F));

		PartDefinition Bodyfront_r14 = Bodymiddle.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-3.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9622F, -10.5644F, 0.4131F, 0.3056F, -0.9488F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(57, 50).mirror().addBox(-13.1897F, -2.3097F, -0.4222F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9622F, -10.5644F, 0.2466F, 0.4495F, -1.3931F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-14.0937F, -2.3347F, -0.4101F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9495F, -12.5668F, 0.2644F, 0.4994F, -1.3666F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(61, 87).mirror().addBox(-3.7905F, -0.8085F, -0.4101F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9495F, -12.5668F, 0.4509F, 0.3438F, -0.9185F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(-1.9655F, -0.067F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9495F, -12.5668F, 0.5532F, 0.1964F, -0.5402F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(86, 2).addBox(3.1897F, -2.3097F, -0.4222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6132F, -2.572F, 0.0933F, -0.1436F, 1.6704F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(54, 87).addBox(1.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6132F, -2.572F, 0.1452F, -0.0908F, 1.2342F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(14, 82).addBox(0.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6132F, -2.572F, 0.1782F, -0.0751F, 0.8404F));

		PartDefinition Bodyfront_r22 = Bodymiddle.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(25, 63).addBox(3.1897F, -2.3097F, -0.4222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7005F, -4.5701F, 0.1527F, -0.2928F, 1.4984F));

		PartDefinition Bodyfront_r23 = Bodymiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(43, 88).addBox(1.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7005F, -4.5701F, 0.2621F, -0.2014F, 1.0579F));

		PartDefinition Bodyfront_r24 = Bodymiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(18, 72).addBox(0.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7005F, -4.5701F, 0.3283F, -0.1329F, 0.6656F));

		PartDefinition Bodyfront_r25 = Bodymiddle.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(20, 61).addBox(3.1897F, -2.3097F, -0.4222F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7877F, -6.5682F, 0.2023F, -0.371F, 1.4612F));

		PartDefinition Bodyfront_r26 = Bodymiddle.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(88, 43).addBox(1.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7877F, -6.5682F, 0.34F, -0.2521F, 1.0195F));

		PartDefinition Bodyfront_r27 = Bodymiddle.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(75, 34).addBox(0.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7877F, -6.5682F, 0.4186F, -0.1509F, 0.6319F));

		PartDefinition Bodyfront_r28 = Bodymiddle.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(69, 32).addBox(3.0937F, -2.3347F, -0.4101F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.775F, -8.5707F, 0.2309F, -0.4175F, 1.4171F));

		PartDefinition Bodyfront_r29 = Bodymiddle.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(7, 89).addBox(1.7905F, -0.8085F, -0.4101F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.775F, -8.5707F, 0.3853F, -0.2829F, 0.9744F));

		PartDefinition Bodyfront_r30 = Bodymiddle.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(83, 48).addBox(-0.0345F, -0.067F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.775F, -8.5707F, 0.4714F, -0.163F, 0.5906F));

		PartDefinition Bodyfront_r31 = Bodymiddle.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(57, 50).addBox(3.1897F, -2.3097F, -0.4222F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9622F, -10.5644F, 0.2466F, -0.4495F, 1.3931F));

		PartDefinition Bodyfront_r32 = Bodymiddle.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(14, 51).addBox(1.867F, -0.7453F, -0.4222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9622F, -10.5644F, 0.4131F, -0.3056F, 0.9488F));

		PartDefinition Bodyfront_r33 = Bodymiddle.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(29, 23).addBox(0.0116F, 0.0205F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9622F, -10.5644F, 0.505F, -0.1741F, 0.5674F));

		PartDefinition Bodyfront_r34 = Bodymiddle.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(57, 24).addBox(3.0937F, -2.3347F, -0.4101F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9495F, -12.5668F, 0.2644F, -0.4994F, 1.3666F));

		PartDefinition Bodyfront_r35 = Bodymiddle.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(61, 87).addBox(1.7905F, -0.8085F, -0.4101F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9495F, -12.5668F, 0.4509F, -0.3438F, 0.9185F));

		PartDefinition Bodyfront_r36 = Bodymiddle.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(83, 50).addBox(-0.0345F, -0.067F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9495F, -12.5668F, 0.5532F, -0.1964F, 0.5402F));

		PartDefinition Osteoderm_r8 = Bodymiddle.addOrReplaceChild("Osteoderm_r8", CubeListBuilder.create().texOffs(24, 104).addBox(0.0F, -1.6418F, -2.3266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 104).addBox(0.0F, 0.9044F, 0.3654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 104).addBox(0.0F, -0.4775F, -1.0839F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7891F, -8.8617F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r9 = Bodymiddle.addOrReplaceChild("Osteoderm_r9", CubeListBuilder.create().texOffs(21, 104).addBox(0.0F, -1.7832F, -2.3229F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4891F, -12.4617F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r10 = Bodymiddle.addOrReplaceChild("Osteoderm_r10", CubeListBuilder.create().texOffs(103, 103).addBox(0.0F, -0.5464F, -1.0113F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6891F, -12.3617F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-5.0F, -2.9905F, 0.1128F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.7765F, -12.1727F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(48, 55).addBox(-4.0F, -0.5F, -4.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.6765F, -10.6727F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.6168F, 0.0423F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6689F, -14.3526F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -14.5F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition Osteoderm_r11 = Bodyfront.addOrReplaceChild("Osteoderm_r11", CubeListBuilder.create().texOffs(104, 45).addBox(0.0F, 0.1047F, -1.053F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4103F, -5.3834F, 0.8901F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r12 = Bodyfront.addOrReplaceChild("Osteoderm_r12", CubeListBuilder.create().texOffs(27, 104).addBox(0.0F, -1.2999F, -2.6818F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 104).addBox(0.0F, -0.117F, -1.0819F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0103F, -1.5834F, 0.8901F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r37 = Bodyfront.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-14.1662F, -2.3146F, -0.4067F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4327F, -0.1959F, 0.2295F, 0.4546F, -1.3979F));

		PartDefinition Bodyfront_r38 = Bodyfront.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-3.8478F, -0.7597F, -0.4067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4327F, -0.1959F, 0.4009F, 0.3169F, -0.95F));

		PartDefinition Bodyfront_r39 = Bodyfront.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4327F, -0.1959F, 0.4983F, 0.1889F, -0.5661F));

		PartDefinition Bodyfront_r40 = Bodyfront.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-14.1662F, -2.3146F, -0.4067F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6327F, -2.0959F, 0.2352F, 0.4713F, -1.4303F));

		PartDefinition Bodyfront_r41 = Bodyfront.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-3.8478F, -0.7597F, -0.4067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6327F, -2.0959F, 0.4134F, 0.3297F, -0.981F));

		PartDefinition Bodyfront_r42 = Bodyfront.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(43, 86).mirror().addBox(-3.9244F, -0.6959F, -0.4146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4327F, -4.1959F, 0.4267F, 0.3879F, -1.0065F));

		PartDefinition Bodyfront_r43 = Bodyfront.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6327F, -2.0959F, 0.5144F, 0.1964F, -0.5979F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-2.0462F, 0.088F, -0.5108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4327F, -4.1959F, 0.5486F, 0.2457F, -0.6206F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-13.2626F, -2.2892F, -0.4146F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4327F, -4.1959F, 0.2188F, 0.529F, -1.4684F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(12, 59).mirror().addBox(-12.2626F, -2.2892F, -0.4146F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2327F, -6.1959F, 0.2272F, 0.5632F, -1.4989F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(21, 85).mirror().addBox(-3.9244F, -0.6959F, -0.4146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2327F, -6.1959F, 0.4503F, 0.4152F, -1.0321F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-2.0462F, 0.088F, -0.5108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2327F, -6.1959F, 0.58F, 0.2628F, -0.6476F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(85, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4327F, -0.1959F, 0.4983F, -0.1889F, 0.5661F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(51, 8).addBox(3.1662F, -2.3146F, -0.4067F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4327F, -0.1959F, 0.2295F, -0.4546F, 1.3979F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(85, 37).addBox(1.8478F, -0.7597F, -0.4067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4327F, -0.1959F, 0.4009F, -0.3169F, 0.95F));

		PartDefinition Neckfront_r5 = Bodyfront.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, -0.7F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9935F, -6.3965F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neckfront_r6 = Bodyfront.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(82, 103).addBox(0.0F, -0.5F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7935F, -8.2965F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neckfront_r7 = Bodyfront.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(85, 103).addBox(0.0F, -0.3F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 103).addBox(0.0F, -0.4F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7935F, -8.3965F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(51, 10).addBox(3.1662F, -2.3146F, -0.4067F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6327F, -2.0959F, 0.2352F, -0.4713F, 1.4303F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(86, 0).addBox(1.8478F, -0.7597F, -0.4067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6327F, -2.0959F, 0.4134F, -0.3297F, 0.981F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(33, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6327F, -2.0959F, 0.5144F, -0.1964F, 0.5979F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(12, 59).addBox(3.2626F, -2.2892F, -0.4146F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2327F, -6.1959F, 0.2272F, -0.5632F, 1.4989F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(21, 85).addBox(1.9244F, -0.6959F, -0.4146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2327F, -6.1959F, 0.4503F, -0.4152F, 1.0321F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(84, 11).addBox(0.0462F, 0.088F, -0.5108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2327F, -6.1959F, 0.58F, -0.2628F, 0.6476F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(86, 72).addBox(0.0462F, 0.088F, -0.5108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4327F, -4.1959F, 0.5486F, -0.2457F, 0.6206F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(43, 86).addBox(1.9244F, -0.6959F, -0.4146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4327F, -4.1959F, 0.4267F, -0.3879F, 1.0065F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(58, 22).addBox(3.2626F, -2.2892F, -0.4146F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4327F, -4.1959F, 0.2188F, -0.529F, 1.4684F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(0.1125F, -2.2444F, -0.3086F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8155F, 7.3298F, -3.7711F, 1.0707F, 0.3825F, 0.5993F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(73, 0).addBox(-5.1125F, -2.2444F, -0.3086F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8155F, 7.3298F, -3.7711F, 1.0707F, -0.3825F, -0.5993F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-0.587F, -0.2533F, -0.2544F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4155F, 2.0298F, -1.1711F, 1.1253F, 0.0969F, 0.0843F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(28, 59).mirror().addBox(-1.2845F, -1.7932F, -3.5956F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 59).addBox(7.7155F, -1.7932F, -3.5956F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7155F, 4.6298F, -1.1711F, 0.9512F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(10, 73).addBox(-0.413F, -0.2533F, -0.2544F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4155F, 2.0298F, -1.1711F, 1.1253F, -0.0969F, -0.0843F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(19, 12).mirror().addBox(-5.9063F, 0.4226F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.9581F, -3.1592F, -0.1842F, 0.6406F, 0.3858F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(43, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 12.2581F, -2.3592F, -0.3258F, 0.7518F, -0.4918F));

		PartDefinition Bodyfront_r68 = Bodyfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-8.9063F, 0.4226F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 12.2581F, -2.3592F, 0.1105F, 0.8006F, 0.1209F));

		PartDefinition Bodyfront_r69 = Bodyfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-6.9063F, 0.4226F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.9581F, -2.5592F, 0.0499F, 0.8102F, 0.2059F));

		PartDefinition Bodyfront_r70 = Bodyfront.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.9581F, -2.5592F, -0.3801F, 0.7357F, -0.3998F));

		PartDefinition Bodyfront_r71 = Bodyfront.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.9581F, -3.1592F, -0.4551F, 0.5002F, -0.1074F));

		PartDefinition Bodyfront_r72 = Bodyfront.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(43, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 12.2581F, -2.3592F, -0.3258F, -0.7518F, 0.4918F));

		PartDefinition Bodyfront_r73 = Bodyfront.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(62, 12).addBox(0.9063F, 0.4226F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 12.2581F, -2.3592F, 0.1105F, -0.8006F, -0.1209F));

		PartDefinition Bodyfront_r74 = Bodyfront.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(74, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.9581F, -2.5592F, -0.3801F, -0.7357F, 0.3998F));

		PartDefinition Bodyfront_r75 = Bodyfront.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(9, 70).addBox(0.9063F, 0.4226F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.9581F, -2.5592F, 0.0499F, -0.8102F, -0.2059F));

		PartDefinition Bodyfront_r76 = Bodyfront.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(19, 12).addBox(0.9063F, 0.4226F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.9581F, -3.1592F, -0.1842F, -0.6406F, -0.3858F));

		PartDefinition Bodyfront_r77 = Bodyfront.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(10, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.9581F, -3.1592F, -0.4551F, -0.5002F, 0.1074F));

		PartDefinition Bodyfront_r78 = Bodyfront.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(51, 95).mirror().addBox(-1.1F, -0.9019F, 0.0301F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 95).addBox(0.1F, -0.9019F, 0.0301F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.083F, -4.9669F, -0.5061F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r79 = Bodyfront.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(94, 88).mirror().addBox(-0.4236F, -0.488F, -3.0127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.083F, -6.4669F, -1.5112F, 0.3659F, -0.8509F));

		PartDefinition Bodyfront_r80 = Bodyfront.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(94, 88).addBox(-0.5764F, -0.488F, -3.0127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.083F, -6.4669F, -1.5112F, -0.3659F, 0.8509F));

		PartDefinition Bodyfront_r81 = Bodyfront.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(37, 59).addBox(-0.5F, -1.1545F, -1.7664F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.383F, -6.4669F, -1.0996F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r82 = Bodyfront.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(17, 32).addBox(0.0F, 0.1476F, -0.3887F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.0211F, -7.2217F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5762F, -7.4827F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Osteoderm_r13 = Neck1.addOrReplaceChild("Osteoderm_r13", CubeListBuilder.create().texOffs(106, 11).addBox(0.0F, -1.1693F, -1.5854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 59).addBox(0.0F, 0.0744F, -0.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5832F, -0.9531F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r1 = Neck1.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(58, 61).mirror().addBox(0.094F, -0.3795F, -0.327F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.194F, -1.2914F, -0.9637F, -0.4115F, 0.3979F));

		PartDefinition Neckmiddle_r2 = Neck1.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(0.109F, -0.2931F, -0.279F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.894F, -3.2914F, -0.9484F, -0.2725F, 0.2194F));

		PartDefinition Neckmiddle_r3 = Neck1.addOrReplaceChild("Neckmiddle_r3", CubeListBuilder.create().texOffs(58, 61).addBox(-0.094F, -0.3795F, -0.327F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.194F, -1.2914F, -0.8899F, 0.3668F, -0.3134F));

		PartDefinition Neckmiddle_r4 = Neck1.addOrReplaceChild("Neckmiddle_r4", CubeListBuilder.create().texOffs(64, 84).addBox(-0.109F, -0.2931F, -0.279F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.894F, -3.2914F, -0.9048F, 0.2725F, -0.2194F));

		PartDefinition Neckfront_r8 = Neck1.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(77, 8).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5664F, -0.6661F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neckfront_r9 = Neck1.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(92, 17).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6888F, -2.6848F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(58, 29).addBox(-1.0F, -0.226F, -5.3829F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, 0.5086F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3418F, -4.2879F, -0.2112F, 0.128F, -0.0274F));

		PartDefinition Osteoderm_r14 = Neck2.addOrReplaceChild("Osteoderm_r14", CubeListBuilder.create().texOffs(106, 32).addBox(0.0F, -0.7359F, -1.1989F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6031F, 0.9381F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Neckfront_r10 = Neck2.addOrReplaceChild("Neckfront_r10", CubeListBuilder.create().texOffs(82, 24).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5674F, 0.4548F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Neckfront_r11 = Neck2.addOrReplaceChild("Neckfront_r11", CubeListBuilder.create().texOffs(36, 78).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3488F, -1.3862F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Neckfront_r12 = Neck2.addOrReplaceChild("Neckfront_r12", CubeListBuilder.create().texOffs(0, 88).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8765F, -3.4285F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r15 = Neck2.addOrReplaceChild("Osteoderm_r15", CubeListBuilder.create().texOffs(106, 37).addBox(0.0F, -0.7514F, -0.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6031F, -1.3619F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r5 = Neck2.addOrReplaceChild("Neckmiddle_r5", CubeListBuilder.create().texOffs(48, 32).mirror().addBox(0.1332F, -0.8456F, -0.1598F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.986F, -0.5002F, -0.8599F, -0.2778F, 0.2138F));

		PartDefinition Neckmiddle_r6 = Neck2.addOrReplaceChild("Neckmiddle_r6", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(0.1482F, -0.7642F, -0.1037F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.114F, -2.5002F, -1.0288F, -0.2123F, 0.1544F));

		PartDefinition Neckmiddle_r7 = Neck2.addOrReplaceChild("Neckmiddle_r7", CubeListBuilder.create().texOffs(100, 46).mirror().addBox(0.1F, -0.5085F, -0.2835F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.214F, -4.5002F, -0.9356F, -0.3187F, 0.2978F));

		PartDefinition Neckmiddle_r8 = Neck2.addOrReplaceChild("Neckmiddle_r8", CubeListBuilder.create().texOffs(48, 32).addBox(-0.1332F, -0.8456F, -0.1598F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.986F, -0.5002F, -0.729F, 0.2778F, -0.2138F));

		PartDefinition Neckmiddle_r9 = Neck2.addOrReplaceChild("Neckmiddle_r9", CubeListBuilder.create().texOffs(67, 38).addBox(-0.1482F, -0.7642F, -0.1037F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.114F, -2.5002F, -0.6361F, 0.2123F, -0.1544F));

		PartDefinition Neckmiddle_r10 = Neck2.addOrReplaceChild("Neckmiddle_r10", CubeListBuilder.create().texOffs(100, 46).addBox(-0.1F, -0.5085F, -0.2835F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.214F, -4.5002F, -0.6361F, 0.2123F, -0.1544F));

		PartDefinition Neckmiddle_r11 = Neck2.addOrReplaceChild("Neckmiddle_r11", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -0.1807F, -5.4761F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, -0.614F, -0.2002F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2143F, -5.1828F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition Osteoderm_r16 = Neck3.addOrReplaceChild("Osteoderm_r16", CubeListBuilder.create().texOffs(104, 97).addBox(0.0F, -0.1658F, -0.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1573F, 1.0568F, 0.7156F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r17 = Neck3.addOrReplaceChild("Osteoderm_r17", CubeListBuilder.create().texOffs(106, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8043F, -3.0272F, 1.0123F, 0.0F, 0.0F));

		PartDefinition Osteoderm_r18 = Neck3.addOrReplaceChild("Osteoderm_r18", CubeListBuilder.create().texOffs(106, 21).addBox(0.0F, 0.0541F, -0.6341F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9573F, -1.3432F, 0.8378F, 0.0F, 0.0F));

		PartDefinition Neckfront_r13 = Neck3.addOrReplaceChild("Neckfront_r13", CubeListBuilder.create().texOffs(37, 59).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1057F, -0.4262F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Neckfront_r14 = Neck3.addOrReplaceChild("Neckfront_r14", CubeListBuilder.create().texOffs(88, 60).addBox(-1.0F, -0.1752F, -3.944F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -0.7681F, 1.0185F, 0.096F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(96, 66).addBox(0.49F, -1.7217F, -4.9538F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(96, 52).addBox(0.8F, -1.7217F, -4.9538F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(96, 66).mirror().addBox(-2.49F, -1.7217F, -4.9538F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(96, 52).mirror().addBox(-2.8F, -1.7217F, -4.9538F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1144F, -2.6815F, 0.2178F, -0.0167F, 0.0403F));

		PartDefinition Hornslope_r1 = Head.addOrReplaceChild("Hornslope_r1", CubeListBuilder.create().texOffs(100, 85).addBox(-0.5F, 0.4841F, -0.0649F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.8077F, -7.6207F, -1.2483F, 0.0F, 0.0F));

		PartDefinition Horn_r1 = Head.addOrReplaceChild("Horn_r1", CubeListBuilder.create().texOffs(14, 45).addBox(-0.5F, -2.235F, -1.1862F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.8077F, -9.6207F, -0.4192F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(9, 92).mirror().addBox(-1.0F, -3.0F, 0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.506F)).mirror(false)
				.texOffs(9, 92).addBox(2.16F, -3.0F, 0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.506F)), PartPose.offsetAndRotation(-1.58F, 0.7543F, -1.8567F, -1.885F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(27, 92).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.502F)).mirror(false)
				.texOffs(27, 92).addBox(2.16F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.502F)), PartPose.offsetAndRotation(-1.58F, 0.7543F, -1.8567F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(70, 98).mirror().addBox(-1.0F, -1.3F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.499F)).mirror(false)
				.texOffs(87, 91).mirror().addBox(-1.0F, -2.0F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(70, 98).addBox(2.16F, -1.3F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.499F))
				.texOffs(87, 91).addBox(2.16F, -2.0F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.58F, 1.2811F, -1.1995F, -2.7751F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(-1.0F, -0.3F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(88, 98).mirror().addBox(-1.0F, -1.0F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.501F)).mirror(false)
				.texOffs(88, 98).addBox(2.16F, -1.0F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.501F))
				.texOffs(79, 98).addBox(2.16F, -0.3F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.58F, -0.5778F, -3.6527F, -1.7453F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(96, 93).mirror().addBox(-1.0F, -0.5694F, -1.4856F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(96, 93).addBox(2.16F, -0.5694F, -1.4856F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.58F, 2.1966F, -4.5327F, -2.2951F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-1.0F, -1.2F, -0.7F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.501F)).mirror(false)
				.texOffs(94, 43).addBox(2.16F, -1.2F, -0.7F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.501F)), PartPose.offsetAndRotation(-1.58F, 0.8009F, -3.8958F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(96, 17).mirror().addBox(-1.0F, -1.7F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(36, 92).mirror().addBox(-1.0F, -1.7F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.499F)).mirror(false)
				.texOffs(91, 72).mirror().addBox(-0.2F, -1.5F, -3.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(96, 17).addBox(2.16F, -1.7F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(91, 72).addBox(1.36F, -1.5F, -3.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(36, 92).addBox(2.16F, -1.7F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.499F)), PartPose.offsetAndRotation(-1.58F, -0.0217F, -3.9538F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-0.8F, -1.6F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.701F)).mirror(false), PartPose.offsetAndRotation(-0.94F, -0.1074F, -11.6187F, 1.9897F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(16, 99).mirror().addBox(0.66F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
				.texOffs(16, 99).addBox(2.3F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(-2.48F, 1.2372F, -10.2037F, -2.618F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(34, 99).mirror().addBox(1.96F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
				.texOffs(34, 99).addBox(3.6F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(-3.78F, 0.175F, -10.2443F, 2.4609F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-1.06F, -1.3565F, -0.7175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-0.88F, -0.2769F, -9.2479F, 3.0543F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-1.06F, -0.5491F, -0.9398F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(25, 99).mirror().addBox(-1.06F, -1.1491F, -0.9398F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.701F)).mirror(false), PartPose.offsetAndRotation(-0.88F, -0.2769F, -9.2479F, 2.2515F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(99, 23).mirror().addBox(-1.0F, -0.4656F, -1.5385F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.499F)).mirror(false)
				.texOffs(0, 94).mirror().addBox(-1.0F, -1.6656F, -2.3385F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.496F)).mirror(false)
				.texOffs(0, 94).addBox(0.56F, -1.6656F, -2.3385F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.496F))
				.texOffs(99, 23).addBox(0.56F, -0.4656F, -1.5385F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.499F)), PartPose.offsetAndRotation(-0.78F, -1.2023F, -7.3905F, 1.9024F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(18, 92).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.499F)).mirror(false)
				.texOffs(18, 92).addBox(0.56F, -2.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.499F)), PartPose.offsetAndRotation(-0.78F, -0.1023F, -7.2905F, 1.3963F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(95, 34).mirror().addBox(-1.0F, -0.5575F, -1.4426F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(95, 34).addBox(0.56F, -0.5575F, -1.4426F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.78F, 0.0977F, -8.7905F, 2.2689F, 0.0F, 0.0F));

		PartDefinition Rightcrestorbit_r1 = Head.addOrReplaceChild("Rightcrestorbit_r1", CubeListBuilder.create().texOffs(30, 32).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -0.0063F, -4.8425F, -0.0813F, -0.5861F, -0.2861F));

		PartDefinition Rightcrestbase_r1 = Head.addOrReplaceChild("Rightcrestbase_r1", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2005F, -1.3475F, -5.0577F, -0.7956F, -0.3539F, 0.0157F));

		PartDefinition Rightcrestextensionslope_r1 = Head.addOrReplaceChild("Rightcrestextensionslope_r1", CubeListBuilder.create().texOffs(31, 69).mirror().addBox(-0.7336F, -0.9663F, -0.6078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -1.8077F, -5.1207F, -1.0886F, -0.1201F, -0.4182F));

		PartDefinition Rightcrestextension_r1 = Head.addOrReplaceChild("Rightcrestextension_r1", CubeListBuilder.create().texOffs(20, 63).mirror().addBox(-0.7336F, -0.9986F, -1.368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -1.8077F, -5.1207F, 0.2029F, -0.1201F, -0.4182F));

		PartDefinition Rightcrestextension_r2 = Head.addOrReplaceChild("Rightcrestextension_r2", CubeListBuilder.create().texOffs(38, 40).mirror().addBox(-0.7336F, -0.1235F, -1.6205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 60).mirror().addBox(-0.7336F, -0.5235F, -1.6205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 17).mirror().addBox(-0.7336F, -1.1235F, -1.6205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -1.8077F, -5.1207F, -0.3905F, -0.1201F, -0.4182F));

		PartDefinition Upperjawslopebase_r1 = Head.addOrReplaceChild("Upperjawslopebase_r1", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.2F, -0.235F, -0.1862F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.3077F, -9.9207F, 0.1233F, -0.1559F, -0.0192F));

		PartDefinition Leftcrestextensionslope_r1 = Head.addOrReplaceChild("Leftcrestextensionslope_r1", CubeListBuilder.create().texOffs(31, 69).addBox(-0.2664F, -0.9663F, -0.6078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -1.8077F, -5.1207F, -1.0886F, 0.1201F, 0.4182F));

		PartDefinition Leftcrestextension_r1 = Head.addOrReplaceChild("Leftcrestextension_r1", CubeListBuilder.create().texOffs(38, 40).addBox(-0.2664F, -0.1235F, -1.6205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 60).addBox(-0.2664F, -0.5235F, -1.6205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 17).addBox(-0.2664F, -1.1235F, -1.6205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.4F, -1.8077F, -5.1207F, -0.3905F, 0.1201F, 0.4182F));

		PartDefinition Leftcrestextension_r2 = Head.addOrReplaceChild("Leftcrestextension_r2", CubeListBuilder.create().texOffs(20, 63).addBox(-0.2664F, -0.9986F, -1.368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4F, -1.8077F, -5.1207F, 0.2029F, 0.1201F, 0.4182F));

		PartDefinition Leftcrestorbit_r1 = Head.addOrReplaceChild("Leftcrestorbit_r1", CubeListBuilder.create().texOffs(30, 32).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9867F, -0.0063F, -4.8425F, -0.0813F, 0.5861F, 0.2861F));

		PartDefinition Leftcrestbase_r1 = Head.addOrReplaceChild("Leftcrestbase_r1", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2005F, -1.3475F, -5.0577F, -0.7956F, 0.3539F, -0.0157F));

		PartDefinition Upperfrontteeth_r1 = Head.addOrReplaceChild("Upperfrontteeth_r1", CubeListBuilder.create().texOffs(43, 78).addBox(-0.8F, -2.259F, -3.7451F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(43, 98).addBox(-0.8F, -2.259F, -2.3451F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 4.5923F, -9.8207F, -0.1543F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth_r1 = Head.addOrReplaceChild("Upperbackteeth_r1", CubeListBuilder.create().texOffs(54, 78).addBox(-0.8F, -1.5646F, 3.9092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(88, 54).addBox(-0.8F, -1.9646F, 0.3092F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2F, 4.5923F, -9.8207F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r1 = Head.addOrReplaceChild("Upperjawslopefront_r1", CubeListBuilder.create().texOffs(97, 9).addBox(-1.0F, -0.0001F, -0.1338F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.3058F, -13.1888F, 1.347F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r2 = Head.addOrReplaceChild("Upperjawslopefront_r2", CubeListBuilder.create().texOffs(85, 84).addBox(-1.0F, -0.0868F, -0.0058F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3942F, -12.6888F, 0.2998F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r2 = Head.addOrReplaceChild("Upperjawslopebase_r2", CubeListBuilder.create().texOffs(21, 69).addBox(-1.0F, 0.165F, 0.2138F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -1.3077F, -9.9207F, 0.1218F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r3 = Head.addOrReplaceChild("Upperjawslopebase_r3", CubeListBuilder.create().texOffs(0, 107).addBox(-1.8F, -0.235F, -0.1862F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(1.2F, -1.3077F, -9.9207F, 0.1233F, 0.1559F, 0.0192F));

		PartDefinition Upperjawfront_r1 = Head.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0F, -0.9554F, -0.9071F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1923F, -12.3207F, 0.0115F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r2 = Head.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(89, 11).addBox(-1.0F, -2.0098F, -2.9526F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.0923F, -9.6207F, -0.3026F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Head.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(101, 40).addBox(-1.0F, -2.9505F, -0.9341F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.202F)), PartPose.offsetAndRotation(0.0F, 3.2042F, -8.6757F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r2 = Head.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(25, 85).addBox(-1.0F, -2.926F, -2.9753F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.205F)), PartPose.offsetAndRotation(0.0F, 2.7042F, -5.6757F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r3 = Head.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(74, 81).addBox(-1.0F, -2.5F, 0.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.202F)), PartPose.offsetAndRotation(0.0F, 1.3042F, -7.1757F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(-0.7F, -2.4499F, -0.4335F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(79, 98).mirror().addBox(-0.7F, -1.4499F, -0.4335F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(79, 98).addBox(1.66F, -2.4499F, -0.4335F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(79, 98).addBox(1.66F, -1.4499F, -0.4335F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.48F, -1.4678F, -1.6661F, -1.8326F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(7, 99).addBox(-0.94F, -1.3565F, -0.7175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.88F, -0.2769F, -9.2479F, 3.0543F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(91, 28).addBox(-1.2F, -1.6F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.701F)), PartPose.offsetAndRotation(0.94F, -0.1074F, -11.6187F, 1.9897F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(25, 99).addBox(-0.94F, -1.1491F, -0.9398F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.701F))
				.texOffs(97, 98).addBox(-0.94F, -0.5491F, -0.9398F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.88F, -0.2769F, -9.2479F, 2.2515F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(23, 78).addBox(-3.0F, -0.3303F, -1.6959F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1217F, -0.3538F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(75, 58).mirror().addBox(-3.0F, 0.0289F, 0.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 58).addBox(0.0F, 0.0289F, 0.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.8217F, 0.3462F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(97, 4).mirror().addBox(-3.0F, -0.9873F, 0.0358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(97, 4).addBox(0.0F, -0.9873F, 0.0358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.0F, 3.4783F, -1.3538F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(69, 26).addBox(-3.0F, -4.6877F, -0.5826F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.02F))
				.texOffs(51, 70).addBox(-3.0F, -4.0877F, 0.0174F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(1.0F, 2.7783F, -4.2538F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(62, 52).addBox(-3.0F, -4.6877F, -0.8826F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(36, 70).addBox(-3.0F, -4.0877F, -1.1826F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 2.7783F, -4.2538F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(58, 99).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -2.0217F, -0.1538F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1923F, 1.6793F, 0.0157F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth_r1 = Lowerjaw.addOrReplaceChild("Lowerfrontteeth_r1", CubeListBuilder.create().texOffs(52, 61).addBox(-1.0F, -0.7374F, -3.8523F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(7, 82).mirror().addBox(-1.5F, -0.5374F, -4.0523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(99, 62).addBox(-1.5F, -0.5374F, -4.1523F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(7, 82).addBox(0.5F, -0.5374F, -4.0523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 3.3337F, -10.5733F, -0.1019F, 0.0F, 0.0F));

		PartDefinition Lowerbackteeth_r1 = Lowerjaw.addOrReplaceChild("Lowerbackteeth_r1", CubeListBuilder.create().texOffs(68, 65).addBox(-1.5F, -0.0255F, 0.074F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4337F, -11.1733F, 0.2F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(82, 17).mirror().addBox(-1.5F, -1.7602F, -3.9065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 4).mirror().addBox(-1.5F, -1.7602F, -3.9065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 30).mirror().addBox(-1.5F, -1.7602F, -3.3065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(84, 30).addBox(0.5F, -1.7602F, -3.3065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.22F))
				.texOffs(84, 4).addBox(0.5F, -1.7602F, -3.9065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 17).addBox(0.5F, -1.7602F, -3.9065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8337F, -10.8733F, -0.1892F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-0.42F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 64).addBox(3.02F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8F, 2.8966F, -5.0462F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Lowerjawfrontslope_r1 = Lowerjaw.addOrReplaceChild("Lowerjawfrontslope_r1", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-2.0F, 0.8557F, -4.6821F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(0, 67).mirror().addBox(-2.0F, 0.8557F, -4.2821F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(66, 55).addBox(1.0F, 0.8557F, -4.6821F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.102F))
				.texOffs(0, 67).addBox(1.0F, 0.8557F, -4.2821F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.7337F, -6.5733F, 0.104F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(-2.0F, -0.0578F, -2.9914F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(84, 77).addBox(1.0F, -0.0578F, -2.9914F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 2.2337F, -8.1733F, 0.2524F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r2 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.0F, -0.4379F, -1.7241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.04F)).mirror(false)
				.texOffs(0, 100).addBox(1.0F, -0.4379F, -1.7241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 1.7337F, -6.5733F, 0.5316F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(25, 45).mirror().addBox(-3.0F, -0.051F, -2.9717F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(96, 57).mirror().addBox(-3.0F, 0.949F, -0.4717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(96, 57).addBox(0.0F, 0.949F, -0.4717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(25, 45).addBox(0.0F, -0.051F, -2.9717F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.4337F, -3.7733F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-3.0F, -1.706F, -2.7038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 76).mirror().addBox(-3.0F, -1.006F, -3.0038F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(11, 61).addBox(0.0F, -1.706F, -2.7038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 76).addBox(0.0F, -1.006F, -3.0038F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.0337F, 0.3267F, 0.8029F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(14, 85).mirror().addBox(-3.0F, -2.0237F, -3.9625F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(14, 85).addBox(0.0F, -2.0237F, -3.9625F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 3.2337F, -1.7733F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-3.0F, -0.092F, -3.883F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 48).addBox(0.0F, -0.092F, -3.883F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1337F, 0.1267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(48, 70).mirror().addBox(-3.0F, 0.025F, 6.5868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(48, 70).addBox(0.0F, 0.025F, 6.5868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 1.6337F, -6.3733F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Throat = Lowerjaw.addOrReplaceChild("Throat", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5337F, -5.3733F));

		PartDefinition Throat_r1 = Throat.addOrReplaceChild("Throat_r1", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.0007F, -1.9215F, -0.0237F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7264F, 2.5311F, -0.0661F, -0.3919F, 0.0253F));

		PartDefinition Throat_r2 = Throat.addOrReplaceChild("Throat_r2", CubeListBuilder.create().texOffs(45, 92).addBox(0.0007F, -1.9215F, -0.0237F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7264F, 2.5311F, -0.0661F, 0.3919F, -0.0253F));

		PartDefinition Masseter = Lowerjaw.addOrReplaceChild("Masseter", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5947F, -5.673F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create().texOffs(100, 71).addBox(-0.3F, -1.5703F, -0.7949F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(47, 86).addBox(-0.3F, -1.5703F, 1.2051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.1F, 10.3789F, -3.0217F, -0.8582F, 0.3202F, -0.2208F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(88, 37).addBox(0.0F, 0.0871F, 0.0457F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(0.0F, 1.2871F, 0.0457F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -1.1F, 6.5F, -1.4856F, -0.0189F, 0.2174F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(47, 78).addBox(-1.0F, -1.7F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3226F, 3.963F, 0.0F, -0.5672F, 0.0F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create().texOffs(100, 28).addBox(-0.7F, -1.5703F, -0.7949F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(36, 86).addBox(-0.7F, -1.5703F, 1.2051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-5.1F, 10.3789F, -3.0217F, -0.3824F, -0.3636F, 0.2306F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(85, 66).addBox(-1.0F, 0.0871F, 0.0457F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(82, 24).addBox(-1.0F, 1.2871F, 0.0457F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -1.1F, 6.5F, -1.4856F, 0.0189F, -0.2174F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(36, 78).addBox(0.0F, -1.7F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.3226F, 3.963F, 0.0F, 0.6981F, 0.0F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -0.4265F, -1.3916F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.1029F, -0.1691F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(80, 89).addBox(-0.5F, -0.3F, -1.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1265F, 0.5084F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(77, 72).addBox(-1.5F, 0.0F, 0.1F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.5735F, -1.4916F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.1118F, -0.9297F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 58).addBox(-0.5F, 0.2882F, 1.6703F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1F, 13.8735F, 0.6084F, 1.4399F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(74, 36).addBox(-1.1F, 0.0F, -2.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 10.7055F, 2.7323F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(57, 43).addBox(-3.1F, -0.3709F, -3.2238F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 7.5F, -0.7F, 0.48F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(50, 0).addBox(-3.1F, -0.4F, -4.4F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0291F, -3.2238F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(42, 15).addBox(-2.0F, -0.4265F, -1.3916F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 0.1029F, -0.1691F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(73, 89).addBox(-0.5F, -0.3F, -1.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1265F, 0.5084F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(33, 0).addBox(-1.5F, 0.0F, 0.1F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.5735F, -1.4916F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.1118F, -0.9297F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(-1.5F, 0.2882F, 1.6703F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.1F, 13.8735F, 0.6084F, 1.2217F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(66, 72).addBox(-1.9F, 0.0F, -2.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 10.7055F, 2.7323F, -0.829F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(57, 15).addBox(-2.9F, -0.3709F, -3.2238F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 7.5F, -0.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(39, 47).addBox(-2.9F, -0.4F, -4.4F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, 0.0291F, -3.2238F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(64, 103).addBox(0.5F, -4.6899F, 0.5527F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 67).addBox(0.5F, -4.9526F, 2.5617F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 67).addBox(0.5F, -5.0163F, 4.5838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 29).addBox(0.5F, -5.1799F, 6.6058F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2029F, 6.4309F, -0.2629F, 0.0832F, -0.0263F));

		PartDefinition Osteoderm_r19 = Tail1.addOrReplaceChild("Osteoderm_r19", CubeListBuilder.create().texOffs(103, 76).addBox(0.0F, 2.8651F, 1.3092F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 14).addBox(0.0F, 1.8176F, 0.0576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 81).addBox(0.0F, 0.5623F, -1.2669F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.8832F, 3.8941F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(11, 29).addBox(0.0F, -0.908F, 0.775F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 36).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8046F, 7.0833F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tail1.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(7, 76).addBox(0.0F, -2.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7377F, 4.646F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tail1.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(61, 103).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3391F, 2.7386F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tail1.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5F, -0.3F, -0.1F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5941F, -0.3442F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 58).addBox(0.5F, -4.4034F, 0.6362F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 29).addBox(0.5F, -4.2906F, 2.6343F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 47).addBox(0.5F, -4.0779F, 4.6324F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 32).addBox(0.5F, -4.1651F, 6.6305F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8357F, 8.3265F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition Osteoderm_r20 = Tail2.addOrReplaceChild("Osteoderm_r20", CubeListBuilder.create().texOffs(71, 38).addBox(0.0F, 10.4416F, 9.8476F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 84).addBox(0.0F, 9.3088F, 8.4487F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 51).addBox(0.0F, 7.9929F, 6.9333F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 83).addBox(0.0F, 4.2211F, 3.0203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 52).addBox(0.0F, 6.7975F, 5.5663F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 0).addBox(0.0F, 5.5093F, 4.2933F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.8977F, -4.46F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tail2.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(52, 100).addBox(0.0F, -0.5014F, 0.8394F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 100).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6913F, 6.5303F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tail2.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1397F, 4.8247F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tail2.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(11, 7).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5726F, 2.8721F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.1752F, 0.0311F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4331F, -0.3381F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(57, 15).addBox(0.5F, -2.6893F, 1.8169F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 32).addBox(0.5F, -2.6021F, 3.815F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 15).addBox(0.5F, -2.3148F, 5.8131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 103).addBox(0.5F, -2.2276F, 7.8112F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0228F, 8.8316F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition Osteoderm_r21 = Tail3.addOrReplaceChild("Osteoderm_r21", CubeListBuilder.create().texOffs(102, 57).addBox(0.0F, 1.6596F, 1.4965F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 103).addBox(0.0F, 0.3599F, -0.0251F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 103).addBox(0.0F, -0.9269F, -1.5586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 103).addBox(0.0F, -2.338F, -2.7344F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.98F, 6.8026F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Neckfront_r15 = Tail3.addOrReplaceChild("Neckfront_r15", CubeListBuilder.create().texOffs(79, 103).addBox(0.0F, -1.5F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5765F, 0.3188F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tail3.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(54, 31).addBox(0.0F, 5.0162F, 7.4993F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 0).addBox(0.0F, 3.8862F, 5.8221F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 14).addBox(0.0F, 2.6088F, 4.28F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 103).addBox(0.0F, 1.2576F, 2.8054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 103).addBox(0.0F, -0.0936F, 1.3309F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 103).addBox(0.0F, -1.4448F, -0.1437F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5891F, 1.0128F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r1 = Tail3.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.2017F, -11.8085F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2181F, 10.581F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(31, 32).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.002F))
				.texOffs(12, 104).addBox(0.5F, -1.7076F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 104).addBox(0.5F, -1.5073F, 1.5152F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 55).addBox(0.5F, -1.3201F, 3.5133F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 38).addBox(0.5F, -1.2328F, 5.5114F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 55).addBox(0.5F, -1.2456F, 7.5095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 45).addBox(0.5F, -1.2583F, 9.5076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4327F, 10.2919F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition Osteoderm_r22 = Tail4.addOrReplaceChild("Osteoderm_r22", CubeListBuilder.create().texOffs(103, 90).addBox(0.0F, 24.456F, 23.8982F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 66).addBox(0.0F, 23.2105F, 22.3206F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(0.0F, 21.7128F, 20.7128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 9).addBox(0.0F, 20.3235F, 19.2741F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 81).addBox(0.0F, 17.573F, 16.5128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 33).addBox(0.0F, 18.9623F, 17.9515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2891F, -23.6617F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tail4.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(69, 26).addBox(0.0F, 17.6123F, 31.4626F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 74).addBox(0.0F, 16.9123F, 29.4626F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 61).addBox(0.0F, 16.0123F, 27.4626F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 17).addBox(0.0F, 15.3468F, 25.7833F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 61).addBox(0.0F, 14.4273F, 23.9155F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0299F, -26.4568F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -0.4872F, -1.1958F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 11.5F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition Osteoderm_r23 = Tail5.addOrReplaceChild("Osteoderm_r23", CubeListBuilder.create().texOffs(88, 74).addBox(0.0F, 26.7134F, 26.5882F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 92).addBox(0.0F, 25.5414F, 25.3406F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 49).addBox(0.0F, 28.9814F, 29.218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 4).addBox(0.0F, 27.8704F, 27.8885F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 92).addBox(0.0F, 30.2564F, 30.5131F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 60).addBox(0.0F, 32.7796F, 33.3144F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 0).addBox(0.0F, 31.4195F, 31.8144F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.9746F, -35.3836F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tail5.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(105, 80).addBox(0.0F, 23.3295F, 40.8723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 83).addBox(0.0F, 22.3461F, 39.1193F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 92).addBox(0.0F, 21.3628F, 37.3662F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 105).addBox(0.0F, 20.5433F, 35.4985F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 4).addBox(0.0F, 19.56F, 33.7455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3445F, -38.1787F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(42, 15).addBox(0.0F, -0.5733F, 0.0921F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0145F, 12.6781F, -0.3213F, 0.2073F, -0.0684F));

		PartDefinition Osteoderm_r24 = Tail6.addOrReplaceChild("Osteoderm_r24", CubeListBuilder.create().texOffs(94, 49).addBox(0.0F, 38.4649F, 39.3551F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 8).addBox(0.0F, 36.9206F, 37.8534F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 54).addBox(0.0F, 35.4763F, 36.2517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 92).addBox(0.0F, 34.1074F, 34.7312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.0532F, -48.3298F, 0.7243F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 115);
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